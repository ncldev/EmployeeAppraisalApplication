package net.nishat.model.EO;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Feb 17 12:49:56 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EO_XXSubOrdFormImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FormId {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getFormId();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setFormId((Number)value);
            }
        }
        ,
        EmployeeDepartment {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getEmployeeDepartment();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setEmployeeDepartment((String)value);
            }
        }
        ,
        LineManagerName {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getLineManagerName();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setLineManagerName((String)value);
            }
        }
        ,
        EmployeeNo {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getEmployeeNo();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setEmployeeNo((String)value);
            }
        }
        ,
        EmployeeName {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getEmployeeName();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setEmployeeName((String)value);
            }
        }
        ,
        EmpQualification {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getEmpQualification();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setEmpQualification((String)value);
            }
        }
        ,
        EmpDesignation {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getEmpDesignation();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setEmpDesignation((String)value);
            }
        }
        ,
        EmpDoj {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getEmpDoj();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setEmpDoj((Date)value);
            }
        }
        ,
        LastPromotionDate {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getLastPromotionDate();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setLastPromotionDate((Date)value);
            }
        }
        ,
        CommercialJudgment {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getCommercialJudgment();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setCommercialJudgment((String)value);
            }
        }
        ,
        ProductTechnicalKnowledge {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getProductTechnicalKnowledge();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setProductTechnicalKnowledge((String)value);
            }
        }
        ,
        TimeManagement {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getTimeManagement();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setTimeManagement((String)value);
            }
        }
        ,
        CommunicationSkills {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getCommunicationSkills();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setCommunicationSkills((String)value);
            }
        }
        ,
        DelegationSkills {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getDelegationSkills();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setDelegationSkills((String)value);
            }
        }
        ,
        MeetingDeadlines {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getMeetingDeadlines();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setMeetingDeadlines((String)value);
            }
        }
        ,
        CommitmentToWork {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getCommitmentToWork();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setCommitmentToWork((String)value);
            }
        }
        ,
        Creativity {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getCreativity();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setCreativity((String)value);
            }
        }
        ,
        ProblemSolving {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getProblemSolving();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setProblemSolving((String)value);
            }
        }
        ,
        TakingInitiative {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getTakingInitiative();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setTakingInitiative((String)value);
            }
        }
        ,
        DecisionMaking {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getDecisionMaking();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setDecisionMaking((String)value);
            }
        }
        ,
        TeamWork {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getTeamWork();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setTeamWork((String)value);
            }
        }
        ,
        DevelopingOthers {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getDevelopingOthers();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setDevelopingOthers((String)value);
            }
        }
        ,
        Leadership {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getLeadership();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setLeadership((String)value);
            }
        }
        ,
        Integrity {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getIntegrity();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setIntegrity((String)value);
            }
        }
        ,
        StabilityUnderPressure {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getStabilityUnderPressure();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setStabilityUnderPressure((String)value);
            }
        }
        ,
        AttitudeTowardsAuthority {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getAttitudeTowardsAuthority();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setAttitudeTowardsAuthority((String)value);
            }
        }
        ,
        Loyalty {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getLoyalty();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setLoyalty((String)value);
            }
        }
        ,
        AbilityToLearn {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getAbilityToLearn();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setAbilityToLearn((String)value);
            }
        }
        ,
        AcceptingChange {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getAcceptingChange();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setAcceptingChange((String)value);
            }
        }
        ,
        PRepectfulPoliteInConvo {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getPRepectfulPoliteInConvo();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setPRepectfulPoliteInConvo((String)value);
            }
        }
        ,
        PEasyToWork {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getPEasyToWork();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setPEasyToWork((String)value);
            }
        }
        ,
        PResponsible {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getPResponsible();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setPResponsible((String)value);
            }
        }
        ,
        PCooperates {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getPCooperates();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setPCooperates((String)value);
            }
        }
        ,
        PSharesInfo {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getPSharesInfo();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setPSharesInfo((String)value);
            }
        }
        ,
        PGeneralCommentsPeers {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getPGeneralCommentsPeers();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setPGeneralCommentsPeers((String)value);
            }
        }
        ,
        LineManagerId {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getLineManagerId();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setLineManagerId((String)value);
            }
        }
        ,
        Posted {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getPosted();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setPosted((String)value);
            }
        }
        ,
        HodRemarks {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getHodRemarks();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setHodRemarks((String)value);
            }
        }
        ,
        SubmitionDate {
            public Object get(EO_XXSubOrdFormImpl obj) {
                return obj.getSubmitionDate();
            }

            public void put(EO_XXSubOrdFormImpl obj, Object value) {
                obj.setSubmitionDate((Date)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(EO_XXSubOrdFormImpl object);

        public abstract void put(EO_XXSubOrdFormImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int FORMID = AttributesEnum.FormId.index();
    public static final int EMPLOYEEDEPARTMENT = AttributesEnum.EmployeeDepartment.index();
    public static final int LINEMANAGERNAME = AttributesEnum.LineManagerName.index();
    public static final int EMPLOYEENO = AttributesEnum.EmployeeNo.index();
    public static final int EMPLOYEENAME = AttributesEnum.EmployeeName.index();
    public static final int EMPQUALIFICATION = AttributesEnum.EmpQualification.index();
    public static final int EMPDESIGNATION = AttributesEnum.EmpDesignation.index();
    public static final int EMPDOJ = AttributesEnum.EmpDoj.index();
    public static final int LASTPROMOTIONDATE = AttributesEnum.LastPromotionDate.index();
    public static final int COMMERCIALJUDGMENT = AttributesEnum.CommercialJudgment.index();
    public static final int PRODUCTTECHNICALKNOWLEDGE = AttributesEnum.ProductTechnicalKnowledge.index();
    public static final int TIMEMANAGEMENT = AttributesEnum.TimeManagement.index();
    public static final int COMMUNICATIONSKILLS = AttributesEnum.CommunicationSkills.index();
    public static final int DELEGATIONSKILLS = AttributesEnum.DelegationSkills.index();
    public static final int MEETINGDEADLINES = AttributesEnum.MeetingDeadlines.index();
    public static final int COMMITMENTTOWORK = AttributesEnum.CommitmentToWork.index();
    public static final int CREATIVITY = AttributesEnum.Creativity.index();
    public static final int PROBLEMSOLVING = AttributesEnum.ProblemSolving.index();
    public static final int TAKINGINITIATIVE = AttributesEnum.TakingInitiative.index();
    public static final int DECISIONMAKING = AttributesEnum.DecisionMaking.index();
    public static final int TEAMWORK = AttributesEnum.TeamWork.index();
    public static final int DEVELOPINGOTHERS = AttributesEnum.DevelopingOthers.index();
    public static final int LEADERSHIP = AttributesEnum.Leadership.index();
    public static final int INTEGRITY = AttributesEnum.Integrity.index();
    public static final int STABILITYUNDERPRESSURE = AttributesEnum.StabilityUnderPressure.index();
    public static final int ATTITUDETOWARDSAUTHORITY = AttributesEnum.AttitudeTowardsAuthority.index();
    public static final int LOYALTY = AttributesEnum.Loyalty.index();
    public static final int ABILITYTOLEARN = AttributesEnum.AbilityToLearn.index();
    public static final int ACCEPTINGCHANGE = AttributesEnum.AcceptingChange.index();
    public static final int PREPECTFULPOLITEINCONVO = AttributesEnum.PRepectfulPoliteInConvo.index();
    public static final int PEASYTOWORK = AttributesEnum.PEasyToWork.index();
    public static final int PRESPONSIBLE = AttributesEnum.PResponsible.index();
    public static final int PCOOPERATES = AttributesEnum.PCooperates.index();
    public static final int PSHARESINFO = AttributesEnum.PSharesInfo.index();
    public static final int PGENERALCOMMENTSPEERS = AttributesEnum.PGeneralCommentsPeers.index();
    public static final int LINEMANAGERID = AttributesEnum.LineManagerId.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int HODREMARKS = AttributesEnum.HodRemarks.index();
    public static final int SUBMITIONDATE = AttributesEnum.SubmitionDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EO_XXSubOrdFormImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("net.nishat.model.EO.EO_XXSubOrdForm");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for FormId, using the alias name FormId.
     * @return the FormId
     */
    public Number getFormId() {
        return (Number)getAttributeInternal(FORMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FormId.
     * @param value value to set the FormId
     */
    public void setFormId(Number value) {
        setAttributeInternal(FORMID, value);
    }

    /**
     * Gets the attribute value for EmployeeDepartment, using the alias name EmployeeDepartment.
     * @return the EmployeeDepartment
     */
    public String getEmployeeDepartment() {
        return (String)getAttributeInternal(EMPLOYEEDEPARTMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeDepartment.
     * @param value value to set the EmployeeDepartment
     */
    public void setEmployeeDepartment(String value) {
        setAttributeInternal(EMPLOYEEDEPARTMENT, value);
    }

    /**
     * Gets the attribute value for LineManagerName, using the alias name LineManagerName.
     * @return the LineManagerName
     */
    public String getLineManagerName() {
        return (String)getAttributeInternal(LINEMANAGERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineManagerName.
     * @param value value to set the LineManagerName
     */
    public void setLineManagerName(String value) {
        setAttributeInternal(LINEMANAGERNAME, value);
    }

    /**
     * Gets the attribute value for EmployeeNo, using the alias name EmployeeNo.
     * @return the EmployeeNo
     */
    public String getEmployeeNo() {
        return (String)getAttributeInternal(EMPLOYEENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeNo.
     * @param value value to set the EmployeeNo
     */
    public void setEmployeeNo(String value) {
        setAttributeInternal(EMPLOYEENO, value);
    }

    /**
     * Gets the attribute value for EmployeeName, using the alias name EmployeeName.
     * @return the EmployeeName
     */
    public String getEmployeeName() {
        return (String)getAttributeInternal(EMPLOYEENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeName.
     * @param value value to set the EmployeeName
     */
    public void setEmployeeName(String value) {
        setAttributeInternal(EMPLOYEENAME, value);
    }

    /**
     * Gets the attribute value for EmpQualification, using the alias name EmpQualification.
     * @return the EmpQualification
     */
    public String getEmpQualification() {
        return (String)getAttributeInternal(EMPQUALIFICATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmpQualification.
     * @param value value to set the EmpQualification
     */
    public void setEmpQualification(String value) {
        setAttributeInternal(EMPQUALIFICATION, value);
    }

    /**
     * Gets the attribute value for EmpDesignation, using the alias name EmpDesignation.
     * @return the EmpDesignation
     */
    public String getEmpDesignation() {
        return (String)getAttributeInternal(EMPDESIGNATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmpDesignation.
     * @param value value to set the EmpDesignation
     */
    public void setEmpDesignation(String value) {
        setAttributeInternal(EMPDESIGNATION, value);
    }

    /**
     * Gets the attribute value for EmpDoj, using the alias name EmpDoj.
     * @return the EmpDoj
     */
    public Date getEmpDoj() {
        return (Date)getAttributeInternal(EMPDOJ);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmpDoj.
     * @param value value to set the EmpDoj
     */
    public void setEmpDoj(Date value) {
        setAttributeInternal(EMPDOJ, value);
    }

    /**
     * Gets the attribute value for LastPromotionDate, using the alias name LastPromotionDate.
     * @return the LastPromotionDate
     */
    public Date getLastPromotionDate() {
        return (Date)getAttributeInternal(LASTPROMOTIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastPromotionDate.
     * @param value value to set the LastPromotionDate
     */
    public void setLastPromotionDate(Date value) {
        setAttributeInternal(LASTPROMOTIONDATE, value);
    }

    /**
     * Gets the attribute value for CommercialJudgment, using the alias name CommercialJudgment.
     * @return the CommercialJudgment
     */
    public String getCommercialJudgment() {
        return (String)getAttributeInternal(COMMERCIALJUDGMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CommercialJudgment.
     * @param value value to set the CommercialJudgment
     */
    public void setCommercialJudgment(String value) {
        setAttributeInternal(COMMERCIALJUDGMENT, value);
    }

    /**
     * Gets the attribute value for ProductTechnicalKnowledge, using the alias name ProductTechnicalKnowledge.
     * @return the ProductTechnicalKnowledge
     */
    public String getProductTechnicalKnowledge() {
        return (String)getAttributeInternal(PRODUCTTECHNICALKNOWLEDGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductTechnicalKnowledge.
     * @param value value to set the ProductTechnicalKnowledge
     */
    public void setProductTechnicalKnowledge(String value) {
        setAttributeInternal(PRODUCTTECHNICALKNOWLEDGE, value);
    }

    /**
     * Gets the attribute value for TimeManagement, using the alias name TimeManagement.
     * @return the TimeManagement
     */
    public String getTimeManagement() {
        return (String)getAttributeInternal(TIMEMANAGEMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimeManagement.
     * @param value value to set the TimeManagement
     */
    public void setTimeManagement(String value) {
        setAttributeInternal(TIMEMANAGEMENT, value);
    }

    /**
     * Gets the attribute value for CommunicationSkills, using the alias name CommunicationSkills.
     * @return the CommunicationSkills
     */
    public String getCommunicationSkills() {
        return (String)getAttributeInternal(COMMUNICATIONSKILLS);
    }

    /**
     * Sets <code>value</code> as the attribute value for CommunicationSkills.
     * @param value value to set the CommunicationSkills
     */
    public void setCommunicationSkills(String value) {
        setAttributeInternal(COMMUNICATIONSKILLS, value);
    }

    /**
     * Gets the attribute value for DelegationSkills, using the alias name DelegationSkills.
     * @return the DelegationSkills
     */
    public String getDelegationSkills() {
        return (String)getAttributeInternal(DELEGATIONSKILLS);
    }

    /**
     * Sets <code>value</code> as the attribute value for DelegationSkills.
     * @param value value to set the DelegationSkills
     */
    public void setDelegationSkills(String value) {
        setAttributeInternal(DELEGATIONSKILLS, value);
    }

    /**
     * Gets the attribute value for MeetingDeadlines, using the alias name MeetingDeadlines.
     * @return the MeetingDeadlines
     */
    public String getMeetingDeadlines() {
        return (String)getAttributeInternal(MEETINGDEADLINES);
    }

    /**
     * Sets <code>value</code> as the attribute value for MeetingDeadlines.
     * @param value value to set the MeetingDeadlines
     */
    public void setMeetingDeadlines(String value) {
        setAttributeInternal(MEETINGDEADLINES, value);
    }

    /**
     * Gets the attribute value for CommitmentToWork, using the alias name CommitmentToWork.
     * @return the CommitmentToWork
     */
    public String getCommitmentToWork() {
        return (String)getAttributeInternal(COMMITMENTTOWORK);
    }

    /**
     * Sets <code>value</code> as the attribute value for CommitmentToWork.
     * @param value value to set the CommitmentToWork
     */
    public void setCommitmentToWork(String value) {
        setAttributeInternal(COMMITMENTTOWORK, value);
    }

    /**
     * Gets the attribute value for Creativity, using the alias name Creativity.
     * @return the Creativity
     */
    public String getCreativity() {
        return (String)getAttributeInternal(CREATIVITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Creativity.
     * @param value value to set the Creativity
     */
    public void setCreativity(String value) {
        setAttributeInternal(CREATIVITY, value);
    }

    /**
     * Gets the attribute value for ProblemSolving, using the alias name ProblemSolving.
     * @return the ProblemSolving
     */
    public String getProblemSolving() {
        return (String)getAttributeInternal(PROBLEMSOLVING);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProblemSolving.
     * @param value value to set the ProblemSolving
     */
    public void setProblemSolving(String value) {
        setAttributeInternal(PROBLEMSOLVING, value);
    }

    /**
     * Gets the attribute value for TakingInitiative, using the alias name TakingInitiative.
     * @return the TakingInitiative
     */
    public String getTakingInitiative() {
        return (String)getAttributeInternal(TAKINGINITIATIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TakingInitiative.
     * @param value value to set the TakingInitiative
     */
    public void setTakingInitiative(String value) {
        setAttributeInternal(TAKINGINITIATIVE, value);
    }

    /**
     * Gets the attribute value for DecisionMaking, using the alias name DecisionMaking.
     * @return the DecisionMaking
     */
    public String getDecisionMaking() {
        return (String)getAttributeInternal(DECISIONMAKING);
    }

    /**
     * Sets <code>value</code> as the attribute value for DecisionMaking.
     * @param value value to set the DecisionMaking
     */
    public void setDecisionMaking(String value) {
        setAttributeInternal(DECISIONMAKING, value);
    }

    /**
     * Gets the attribute value for TeamWork, using the alias name TeamWork.
     * @return the TeamWork
     */
    public String getTeamWork() {
        return (String)getAttributeInternal(TEAMWORK);
    }

    /**
     * Sets <code>value</code> as the attribute value for TeamWork.
     * @param value value to set the TeamWork
     */
    public void setTeamWork(String value) {
        setAttributeInternal(TEAMWORK, value);
    }

    /**
     * Gets the attribute value for DevelopingOthers, using the alias name DevelopingOthers.
     * @return the DevelopingOthers
     */
    public String getDevelopingOthers() {
        return (String)getAttributeInternal(DEVELOPINGOTHERS);
    }

    /**
     * Sets <code>value</code> as the attribute value for DevelopingOthers.
     * @param value value to set the DevelopingOthers
     */
    public void setDevelopingOthers(String value) {
        setAttributeInternal(DEVELOPINGOTHERS, value);
    }

    /**
     * Gets the attribute value for Leadership, using the alias name Leadership.
     * @return the Leadership
     */
    public String getLeadership() {
        return (String)getAttributeInternal(LEADERSHIP);
    }

    /**
     * Sets <code>value</code> as the attribute value for Leadership.
     * @param value value to set the Leadership
     */
    public void setLeadership(String value) {
        setAttributeInternal(LEADERSHIP, value);
    }

    /**
     * Gets the attribute value for Integrity, using the alias name Integrity.
     * @return the Integrity
     */
    public String getIntegrity() {
        return (String)getAttributeInternal(INTEGRITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Integrity.
     * @param value value to set the Integrity
     */
    public void setIntegrity(String value) {
        setAttributeInternal(INTEGRITY, value);
    }

    /**
     * Gets the attribute value for StabilityUnderPressure, using the alias name StabilityUnderPressure.
     * @return the StabilityUnderPressure
     */
    public String getStabilityUnderPressure() {
        return (String)getAttributeInternal(STABILITYUNDERPRESSURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StabilityUnderPressure.
     * @param value value to set the StabilityUnderPressure
     */
    public void setStabilityUnderPressure(String value) {
        setAttributeInternal(STABILITYUNDERPRESSURE, value);
    }

    /**
     * Gets the attribute value for AttitudeTowardsAuthority, using the alias name AttitudeTowardsAuthority.
     * @return the AttitudeTowardsAuthority
     */
    public String getAttitudeTowardsAuthority() {
        return (String)getAttributeInternal(ATTITUDETOWARDSAUTHORITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for AttitudeTowardsAuthority.
     * @param value value to set the AttitudeTowardsAuthority
     */
    public void setAttitudeTowardsAuthority(String value) {
        setAttributeInternal(ATTITUDETOWARDSAUTHORITY, value);
    }

    /**
     * Gets the attribute value for Loyalty, using the alias name Loyalty.
     * @return the Loyalty
     */
    public String getLoyalty() {
        return (String)getAttributeInternal(LOYALTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Loyalty.
     * @param value value to set the Loyalty
     */
    public void setLoyalty(String value) {
        setAttributeInternal(LOYALTY, value);
    }

    /**
     * Gets the attribute value for AbilityToLearn, using the alias name AbilityToLearn.
     * @return the AbilityToLearn
     */
    public String getAbilityToLearn() {
        return (String)getAttributeInternal(ABILITYTOLEARN);
    }

    /**
     * Sets <code>value</code> as the attribute value for AbilityToLearn.
     * @param value value to set the AbilityToLearn
     */
    public void setAbilityToLearn(String value) {
        setAttributeInternal(ABILITYTOLEARN, value);
    }

    /**
     * Gets the attribute value for AcceptingChange, using the alias name AcceptingChange.
     * @return the AcceptingChange
     */
    public String getAcceptingChange() {
        return (String)getAttributeInternal(ACCEPTINGCHANGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AcceptingChange.
     * @param value value to set the AcceptingChange
     */
    public void setAcceptingChange(String value) {
        setAttributeInternal(ACCEPTINGCHANGE, value);
    }

    /**
     * Gets the attribute value for PRepectfulPoliteInConvo, using the alias name PRepectfulPoliteInConvo.
     * @return the PRepectfulPoliteInConvo
     */
    public String getPRepectfulPoliteInConvo() {
        return (String)getAttributeInternal(PREPECTFULPOLITEINCONVO);
    }

    /**
     * Sets <code>value</code> as the attribute value for PRepectfulPoliteInConvo.
     * @param value value to set the PRepectfulPoliteInConvo
     */
    public void setPRepectfulPoliteInConvo(String value) {
        setAttributeInternal(PREPECTFULPOLITEINCONVO, value);
    }

    /**
     * Gets the attribute value for PEasyToWork, using the alias name PEasyToWork.
     * @return the PEasyToWork
     */
    public String getPEasyToWork() {
        return (String)getAttributeInternal(PEASYTOWORK);
    }

    /**
     * Sets <code>value</code> as the attribute value for PEasyToWork.
     * @param value value to set the PEasyToWork
     */
    public void setPEasyToWork(String value) {
        setAttributeInternal(PEASYTOWORK, value);
    }

    /**
     * Gets the attribute value for PResponsible, using the alias name PResponsible.
     * @return the PResponsible
     */
    public String getPResponsible() {
        return (String)getAttributeInternal(PRESPONSIBLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PResponsible.
     * @param value value to set the PResponsible
     */
    public void setPResponsible(String value) {
        setAttributeInternal(PRESPONSIBLE, value);
    }

    /**
     * Gets the attribute value for PCooperates, using the alias name PCooperates.
     * @return the PCooperates
     */
    public String getPCooperates() {
        return (String)getAttributeInternal(PCOOPERATES);
    }

    /**
     * Sets <code>value</code> as the attribute value for PCooperates.
     * @param value value to set the PCooperates
     */
    public void setPCooperates(String value) {
        setAttributeInternal(PCOOPERATES, value);
    }

    /**
     * Gets the attribute value for PSharesInfo, using the alias name PSharesInfo.
     * @return the PSharesInfo
     */
    public String getPSharesInfo() {
        return (String)getAttributeInternal(PSHARESINFO);
    }

    /**
     * Sets <code>value</code> as the attribute value for PSharesInfo.
     * @param value value to set the PSharesInfo
     */
    public void setPSharesInfo(String value) {
        setAttributeInternal(PSHARESINFO, value);
    }

    /**
     * Gets the attribute value for PGeneralCommentsPeers, using the alias name PGeneralCommentsPeers.
     * @return the PGeneralCommentsPeers
     */
    public String getPGeneralCommentsPeers() {
        return (String)getAttributeInternal(PGENERALCOMMENTSPEERS);
    }

    /**
     * Sets <code>value</code> as the attribute value for PGeneralCommentsPeers.
     * @param value value to set the PGeneralCommentsPeers
     */
    public void setPGeneralCommentsPeers(String value) {
        setAttributeInternal(PGENERALCOMMENTSPEERS, value);
    }

    /**
     * Gets the attribute value for LineManagerId, using the alias name LineManagerId.
     * @return the LineManagerId
     */
    public String getLineManagerId() {
        return (String)getAttributeInternal(LINEMANAGERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineManagerId.
     * @param value value to set the LineManagerId
     */
    public void setLineManagerId(String value) {
        setAttributeInternal(LINEMANAGERID, value);
    }

    /**
     * Gets the attribute value for Posted, using the alias name Posted.
     * @return the Posted
     */
    public String getPosted() {
        return (String)getAttributeInternal(POSTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Posted.
     * @param value value to set the Posted
     */
    public void setPosted(String value) {
        setAttributeInternal(POSTED, value);
    }

    /**
     * Gets the attribute value for HodRemarks, using the alias name HodRemarks.
     * @return the HodRemarks
     */
    public String getHodRemarks() {
        return (String)getAttributeInternal(HODREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for HodRemarks.
     * @param value value to set the HodRemarks
     */
    public void setHodRemarks(String value) {
        setAttributeInternal(HODREMARKS, value);
    }

    /**
     * Gets the attribute value for SubmitionDate, using the alias name SubmitionDate.
     * @return the SubmitionDate
     */
    public Date getSubmitionDate() {
        return (Date)getAttributeInternal(SUBMITIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubmitionDate.
     * @param value value to set the SubmitionDate
     */
    public void setSubmitionDate(Date value) {
        setAttributeInternal(SUBMITIONDATE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }


    /**
     * @param formId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number formId) {
        return new Key(new Object[]{formId});
    }

    @Override
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        this.setFormId(new SequenceImpl("xx_emp_ap_form_seq",
                                                   getDBTransaction()).getSequenceNumber());
    }
}