package net.nishat.model.Search;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 25 14:22:40 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VO_SearchPeersImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public VO_SearchPeersImpl() {
    }

    /**
     * Returns the bind variable value for department_name.
     * @return bind variable value for department_name
     */
    public String getdepartment_name() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        HttpServletRequest req =
            (HttpServletRequest)fctx.getExternalContext().getRequest();
        HttpSession session = req.getSession();
        String dpt = ((String)session.getAttribute("user_dpt"));
        System.out.println("VO_SearchPeers: "+dpt);
        if (dpt == null) {
            return "";
        }else{
            return dpt.trim();
        }
        
        
    }

    /**
     * Sets <code>value</code> for bind variable department_name.
     * @param value value to bind as department_name
     */
    public void setdepartment_name(String value) {
        setNamedWhereClauseParam("department_name", value);
    }

    /**
     * Returns the variable value for full_name.
     * @return variable value for full_name
     */
    public String getfull_name() {
        return (String)ensureVariableManager().getVariableValue("full_name");
    }

    /**
     * Sets <code>value</code> for variable full_name.
     * @param value value to bind as full_name
     */
    public void setfull_name(String value) {
        ensureVariableManager().setVariableValue("full_name", value);
    }
}