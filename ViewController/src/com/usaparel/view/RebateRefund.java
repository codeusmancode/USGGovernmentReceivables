package com.usaparel.view;


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import java.util.Map;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputFile;

import oracle.apps.fnd.ext.common.AppsRequestWrapper;

import oracle.apps.fnd.ext.common.AppsSessionHelper;
import oracle.apps.fnd.ext.common.Session;

import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.UploadedFile;

public class RebateRefund {
    private UploadedFile uploadedFile;
    private RichTable table;

    public RebateRefund() {
    }

    public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }

    private void uploadFile(UploadedFile f,String folder) {
        String filename = f.getFilename();
        
      
        File folderDir = new File(folder);
        if (!folderDir.exists())
            folderDir.mkdir();
        
        String destFileLocation = folder+"//"+filename;
        
        InputStream is = null;
        FileOutputStream out = null;
        try {
            is = f.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            

            out = new FileOutputStream(destFileLocation);
            while ((bytesRead = is.read(buffer, 0, 1024)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            is.close();
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String upload() {
        UploadedFile  f = getUploadedFile();
        String filename = f.getFilename();
        
        
        String type = f.getContentType();
        
        Row rebateRow = (Row) ADFUtil.evaluateEL("#{bindings.VOXxReabateRefund1Iterator.currentRow}");
        int rebateID = Integer.parseInt(rebateRow.getAttribute("RebateRefundId").toString());
        //String folder = "D:\\remp\\DOC"+rebateID;
        String folder = "//home//oracle//govt_rec_docs//DOC"+rebateID;
        String destFileLocation = folder+"//"+ filename;
        
        uploadFile(f,folder);
        
        //create a row in database
        ViewObject vo = getViewObject("VOXxRebateRefundAttachment2Iterator");
        Row r = vo.createRow();
        r.setAttribute("RebateRefundId", rebateID);
        r.setAttribute("FileName", filename);
        r.setAttribute("FileLocation", destFileLocation);
        r.setAttribute("AttchType", type);
        
        callOperation("Commit", null);
        
        vo.executeQuery();
        return null;
    }
    
    private BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    private ViewObject getViewObject(String iterator) {
        BindingContainer bindings = getBindings();
        DCBindingContainer bc = (DCBindingContainer) bindings;
        DCIteratorBinding it = bc.findIteratorBinding(iterator);
        return it.getViewObject();
    }
    private Object callOperation(String actionName, Map params) {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding(actionName);
        if (params != null) {
            System.out.println(" params is not null");
            operationBinding.getParamsMap().putAll(params);
        }
        Object result = operationBinding.execute();
        return result;
    }

    public String logout() {
        try{
            HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance()
                                                                      .getExternalContext()
                                                                      .getRequest();
            HttpServletResponse res = (HttpServletResponse) FacesContext.getCurrentInstance()
                                                                        .getExternalContext()
                                                                        .getResponse();
            AppsRequestWrapper wrappedRequest =
                new AppsRequestWrapper(req, res, ConnectionProvider.getConnection(), EbizUtil.getEBizInstance());
            Session session = wrappedRequest.getAppsSession();
            if (session != null){
                AppsSessionHelper helper = new AppsSessionHelper(wrappedRequest.getEbizInstance());
                helper.destroyAppsSession(session, req, res);
            }
            session.invalidate();
            
            //invalidate the browser session also
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            
            res.sendRedirect(wrappedRequest.getEbizInstance().getAppsServletAgent() + "AppsLocalLogin.jsp");
            FacesContext.getCurrentInstance().responseComplete();
        }catch(Exception ex){
            System.out.println("##########################################################");
            System.out.println(ex.getMessage());
            System.out.println("##########################################################");
        }
        return null;
    }

    public String insertAction() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        
//        RichTable table = this.getTable();
//        if (table != null) {
//            RowKeySet selection = table.getSelectedRowKeys();
//            for (Object selectedRowKey : selection) {
//                
//
//                FacesContext context = FacesContext.getCurrentInstance();
//                String rowId = table.getClientRowKeyManager().getClientRowKey(context, table, selectedRowKey);
//                String tableClientId = table.getClientId(context);
//                String focusId = tableClientId + ":" + rowId; 
//
//                System.out.println("Focus ID: " + focusId);
//
//        //                ExtendedRenderKitService erks =
//        //                    Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
//        //                erks.addScript(context, "setFocusByComponentId('" + focusId + "')");
//            }
//        }
        return null;
    }

    public void setTable(RichTable table) {
        this.table = table;
    }

    public RichTable getTable() {
        return table;
    }
}
