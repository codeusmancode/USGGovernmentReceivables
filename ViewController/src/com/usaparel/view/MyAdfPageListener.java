package com.usaparel.view;


import java.io.IOException;

import java.sql.SQLException;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.adf.controller.v2.lifecycle.Lifecycle;
import oracle.adf.controller.v2.lifecycle.PagePhaseEvent;
import oracle.adf.controller.v2.lifecycle.PagePhaseListener;

import oracle.adf.share.ADFContext;

import oracle.apps.fnd.ext.common.AppsRequestWrapper;
import oracle.apps.fnd.ext.common.AppsRequestWrapper.WrapperException;
import oracle.apps.fnd.ext.common.CookieStatus;


public class MyAdfPageListener implements PagePhaseListener {
    public MyAdfPageListener() {
    }

    public void afterPhase(PagePhaseEvent pagePhaseEvent) {

    }

    public void beforePhase(PagePhaseEvent pagePhaseEvent) {
        if (pagePhaseEvent.getPhaseId() == Lifecycle.INIT_CONTEXT_ID) {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("@@@@@@@@@@@@@@@Before Phase Called@@@@@@@@@@@@@@@@@");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            
            HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance()
                                                                      .getExternalContext()
                                                                      .getRequest();
            HttpServletResponse res = (HttpServletResponse) FacesContext.getCurrentInstance()
                                                                        .getExternalContext()
                                                                        .getResponse();
            AppsRequestWrapper wrappedRequest =null;
            try {
            
                 wrappedRequest =
                    new AppsRequestWrapper(req, res, ConnectionProvider.getConnection(), EbizUtil.getEBizInstance());
                
                if (!wrappedRequest.getAppsSession(true).getCurrentState().getIcxCookieStatus().equals(CookieStatus.VALID)) {
                    FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
                    try {
                        res.sendRedirect(wrappedRequest.getEbizInstance().getAppsServletAgent() + "AppsLocalLogin.jsp");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    //if has not session then set the session
                    if (ADFContext.getCurrent()
                                  .getSessionScope()
                                  .get("username") == null) {
                        String username = wrappedRequest.getAppsSession().getUserName();
                        String userid = wrappedRequest.getAppsSession().getUserId();
                        ADFContext.getCurrent()
                                  .getSessionScope()
                                  .put("username", username);
                        ADFContext.getCurrent()
                                  .getSessionScope()
                                  .put("userid", userid);
                    }
                }

            } catch (WrapperException f) {
                f.printStackTrace();
            } catch (SQLException f) {
                f.printStackTrace();
            }finally{
                try{
                    wrappedRequest.getConnection().close(); 
                    System.out.println("closing connection");
                }catch(Exception ex){
                    System.out.println("trouble closing connection in page listener "+ex.getMessage());
                }
                
            }

        }
    }

}
