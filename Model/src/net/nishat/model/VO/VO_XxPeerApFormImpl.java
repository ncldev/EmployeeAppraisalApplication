package net.nishat.model.VO;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 25 14:50:55 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VO_XxPeerApFormImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public VO_XxPeerApFormImpl() {
    }

    /**
     * Returns the bind variable value for dpt_name.
     * @return bind variable value for dpt_name
     */
    public String getdpt_name() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        HttpServletRequest req =
            (HttpServletRequest)fctx.getExternalContext().getRequest();
        HttpSession session = req.getSession();
        String dpt = ((String)session.getAttribute("user_dpt"));
        System.out.println("VO_PeerApForm: "+dpt);
        if (dpt == null) {
            return "";
        }else{
            return dpt.trim();
        }
    }


    /**
     * Returns the bind variable value for evaluated_by.
     * @return bind variable value for evaluated_by
     */
    public String getevaluated_by() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        HttpServletRequest req =
            (HttpServletRequest)fctx.getExternalContext().getRequest();
        HttpSession session = req.getSession();
        String id = ((String)session.getAttribute("user_id"));
        System.out.println("VO_PeerApForm: "+id);
        if (id == null) {
            return "";
        }else{
            return id.trim();
        }
    }

    /**
     * Sets <code>value</code> for bind variable evaluated_by.
     * @param value value to bind as evaluated_by
     */
    public void setevaluated_by(String value) {
        setNamedWhereClauseParam("evaluated_by", value);
    }

    /**
     * Returns the variable value for peer_name.
     * @return variable value for peer_name
     */
    public String getpeer_name() {
        return (String)ensureVariableManager().getVariableValue("peer_name");
    }

    /**
     * Sets <code>value</code> for variable peer_name.
     * @param value value to bind as peer_name
     */
    public void setpeer_name(String value) {
        ensureVariableManager().setVariableValue("peer_name", value);
    }
}
