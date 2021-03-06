package net.nishat.model.AM;

import net.nishat.model.AM.common.AppModule;
import net.nishat.model.Search.TotalSubsImpl;
import net.nishat.model.Search.VO_SearchEmployeeAllUnderHODImpl;
import net.nishat.model.Search.VO_SearchEmployeeImpl;
import net.nishat.model.Search.VO_SearchPeersImpl;
import net.nishat.model.VO.VO_ViewFormsImpl;
import net.nishat.model.VO.VO_XXSubOrdFormImpl;
import net.nishat.model.VO.VO_XXSubOrdFormV2Impl;
import net.nishat.model.VO.VO_XxEmpApFormImpl;

import net.nishat.model.VO.VO_XxPeerApFormImpl;

import net.nishat.model.VO.VO_XxPeerApFormRowImpl;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 25 11:32:22 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }

    /**
     * Container's getter for VO_XxEmpApForm1.
     * @return VO_XxEmpApForm1
     */
    public VO_XxEmpApFormImpl getVO_XxEmpApForm1() {
        return (VO_XxEmpApFormImpl)findViewObject("VO_XxEmpApForm1");
    }

    /**
     * Container's getter for VO_XXSubOrdForm1.
     * @return VO_XXSubOrdForm1
     */
    public VO_XXSubOrdFormImpl getVO_XXSubOrdForm1() {
        return (VO_XXSubOrdFormImpl)findViewObject("VO_XXSubOrdForm1");
    }

    /**
     * Container's getter for VO_SearchEmployee.
     * @return VO_SearchEmployee
     */
    public VO_SearchEmployeeImpl getVO_SearchEmployee() {
        return (VO_SearchEmployeeImpl)findViewObject("VO_SearchEmployee");
    }

    /**
     * Container's getter for TotalSubs1.
     * @return TotalSubs1
     */
    public TotalSubsImpl getTotalSubs1() {
        return (TotalSubsImpl)findViewObject("TotalSubs1");
    }

    /**
     * Container's getter for VO_ViewForms1.
     * @return VO_ViewForms1
     */
    public VO_ViewFormsImpl getVO_ViewForms1() {
        return (VO_ViewFormsImpl)findViewObject("VO_ViewForms1");
    }

    /**
     * Container's getter for VO_SearchEmployeeAll1.
     * @return VO_SearchEmployeeAll1
     */
    public VO_SearchEmployeeAllUnderHODImpl getVO_SearchEmployeeAll1() {
        return (VO_SearchEmployeeAllUnderHODImpl)findViewObject("VO_SearchEmployeeAll1");
    }

    /**
     * Container's getter for VO_XxPeerApForm1.
     * @return VO_XxPeerApForm1
     */
    public ViewObjectImpl getVO_XxPeerApForm1() {
        return (ViewObjectImpl)findViewObject("VO_XxPeerApForm1");
    }
    public void refreshEmpFormData(){
        VO_XxEmpApFormImpl vo = getVO_XxEmpApForm1();
        vo.executeQuery();
    }
    public void refreshSubordFormData(){
       
        ViewObjectImpl vo1 = getVO_XXSubOrdFormV2_1();
        vo1.executeQuery();
    }
    
    public void refreshPeerFormData(){
       VO_XxPeerApFormImpl vo = (VO_XxPeerApFormImpl) getVO_XxPeerApForm2();
       vo.executeQuery();
    }

    /**
     * Container's getter for VO_XxPeerApForm2.
     * @return VO_XxPeerApForm2
     */
    public ViewObjectImpl getVO_XxPeerApForm2() {
        return (ViewObjectImpl)findViewObject("VO_XxPeerApForm2");
    }

    /**
     * Container's getter for VO_SearchPeers1.
     * @return VO_SearchPeers1
     */
    public ViewObjectImpl getVO_SearchPeers1() {
        return (ViewObjectImpl)findViewObject("VO_SearchPeers1");
    }

    /**
     * Container's getter for VO_AllEmployeeSearch1.
     * @return VO_AllEmployeeSearch1
     */
    public ViewObjectImpl getVO_AllEmployeeSearch1() {
        return (ViewObjectImpl)findViewObject("VO_AllEmployeeSearch1");
    }

    /**
     * Container's getter for VO_XXSubOrdFormV2_1.
     * @return VO_XXSubOrdFormV2_1
     */
    public ViewObjectImpl getVO_XXSubOrdFormV2_1() {
        return (ViewObjectImpl)findViewObject("VO_XXSubOrdFormV2_1");
    }

    /**
     * Container's getter for VO_LovGradingScaleForSubordinate1.
     * @return VO_LovGradingScaleForSubordinate1
     */
    public ViewObjectImpl getVO_LovGradingScaleForSubordinate1() {
        return (ViewObjectImpl)findViewObject("VO_LovGradingScaleForSubordinate1");
    }

    /**
     * Container's getter for VO_ViewForms_v2_1.
     * @return VO_ViewForms_v2_1
     */
    public ViewObjectImpl getVO_ViewForms_v2_1() {
        return (ViewObjectImpl)findViewObject("VO_ViewForms_v2_1");
    }
}
