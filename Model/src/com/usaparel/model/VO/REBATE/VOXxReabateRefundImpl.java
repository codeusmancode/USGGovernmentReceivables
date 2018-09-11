package com.usaparel.model.VO.REBATE;

import java.math.BigDecimal;

import oracle.jbo.RowSetIterator;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 10 16:27:12 PKT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VOXxReabateRefundImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public VOXxReabateRefundImpl() {
    }
    private BigDecimal rebateAmountSum;

    /**
     * Returns the variable value for p_shipping_bill.
     * @return variable value for p_shipping_bill
     */
    
    public String getp_shipping_bill() {
        return (String) ensureVariableManager().getVariableValue("p_shipping_bill");
    }

    public void setRebateAmountSum(BigDecimal rebateAmountSum) {
        this.rebateAmountSum = rebateAmountSum;
    }

    public BigDecimal getRebateAmountSum() {
        return rebateAmountSum;
    }

    /**
     * Sets <code>value</code> for variable p_shipping_bill.
     * @param value value to bind as p_shipping_bill
     */
    public void setp_shipping_bill(String value) {
        ensureVariableManager().setVariableValue("p_shipping_bill", value);
    }

    /**
     * Returns the variable value for p_inv_num.
     * @return variable value for p_inv_num
     */
    public String getp_inv_num() {
        return (String) ensureVariableManager().getVariableValue("p_inv_num");
    }

    /**
     * Sets <code>value</code> for variable p_inv_num.
     * @param value value to bind as p_inv_num
     */
    public void setp_inv_num(String value) {
        ensureVariableManager().setVariableValue("p_inv_num", value);
    }

    /**
     * Returns the variable value for p_unit.
     * @return variable value for p_unit
     */
    public String getp_unit() {
        return (String) ensureVariableManager().getVariableValue("p_unit");
    }

    /**
     * Sets <code>value</code> for variable p_unit.
     * @param value value to bind as p_unit
     */
    public void setp_unit(String value) {
        ensureVariableManager().setVariableValue("p_unit", value);
    }

    /**
     * Returns the variable value for p_status.
     * @return variable value for p_status
     */
    public String getp_status() {
        return (String) ensureVariableManager().getVariableValue("p_status");
    }

    /**
     * Sets <code>value</code> for variable p_status.
     * @param value value to bind as p_status
     */
    public void setp_status(String value) {
        ensureVariableManager().setVariableValue("p_status", value);
    }

    /**
     * Returns the variable value for p_com_inv.
     * @return variable value for p_com_inv
     */
    public String getp_com_inv() {
        return (String) ensureVariableManager().getVariableValue("p_com_inv");
    }

    /**
     * Sets <code>value</code> for variable p_com_inv.
     * @param value value to bind as p_com_inv
     */
    public void setp_com_inv(String value) {
        ensureVariableManager().setVariableValue("p_com_inv", value);
    }

    /**
     * Returns the variable value for p_dataformat.
     * @return variable value for p_dataformat
     */
    public String getp_dataformat() {
        return (String) ensureVariableManager().getVariableValue("p_dataformat");
    }

    /**
     * Sets <code>value</code> for variable p_dataformat.
     * @param value value to bind as p_dataformat
     */
    public void setp_dataformat(String value) {
        ensureVariableManager().setVariableValue("p_dataformat", value);
    }

    @Override
    public void executeQuery() {
        
        super.executeQuery();
       
    }
    
}

