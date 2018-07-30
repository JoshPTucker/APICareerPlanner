package apicareer.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    private String dateDeveloped;

    private String postSecondaryEd;
    private String ProfessionalCertifications;

    private String employer;
    private String wage;
    private String industry;
    private String position;
    private String otherExperience;
    private String reasonForLeaving;

    private String prevteFromEmployment;

    private String transportation;

    private boolean driversLiscense;
    private boolean housingAssist;
    private boolean childFamilyCareAssist;
    private boolean financialAssist;
    private boolean healthAssist;
    private boolean transportationAssist;
    private boolean businessAttireAssist;
    private boolean legalAssist;
    private boolean otherAssist;


    private boolean localCareerOneStop;
    private boolean mcEmploymentService;
    private boolean POAC;
    private boolean localIndustryNetGroup;
    private boolean profAssociations;
    private boolean mdWorkforceExchange;
    private boolean linkedin;


    private String ltCareerGoal;
    private String positionAppy;
    private String skillsExp;
    private String trainingNeeded;
    private String tasksYoullEnjoy;
    private String seeGrowth;
    private String twoAreagrowth;


    private String diredWage;
    private String desiredLocal;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateDeveloped() {
        return dateDeveloped;
    }

    public void setDateDeveloped(String dateDeveloped) {
        this.dateDeveloped = dateDeveloped;
    }

    public String getPostSecondaryEd() {
        return postSecondaryEd;
    }

    public void setPostSecondaryEd(String postSecondaryEd) {
        this.postSecondaryEd = postSecondaryEd;
    }

    public String getProfessionalCertifications() {
        return ProfessionalCertifications;
    }

    public void setProfessionalCertifications(String professionalCertifications) {
        ProfessionalCertifications = professionalCertifications;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOtherExperience() {
        return otherExperience;
    }

    public void setOtherExperience(String otherExperience) {
        this.otherExperience = otherExperience;
    }

    public String getReasonForLeaving() {
        return reasonForLeaving;
    }

    public void setReasonForLeaving(String reasonForLeaving) {
        this.reasonForLeaving = reasonForLeaving;
    }

    public String getPrevteFromEmployment() {
        return prevteFromEmployment;
    }

    public void setPrevteFromEmployment(String prevteFromEmployment) {
        this.prevteFromEmployment = prevteFromEmployment;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public boolean isDriversLiscense() {
        return driversLiscense;
    }

    public void setDriversLiscense(boolean driversLiscense) {
        this.driversLiscense = driversLiscense;
    }

    public boolean isHousingAssist() {
        return housingAssist;
    }

    public void setHousingAssist(boolean housingAssist) {
        this.housingAssist = housingAssist;
    }

    public boolean isChildFamilyCareAssist() {
        return childFamilyCareAssist;
    }

    public void setChildFamilyCareAssist(boolean childFamilyCareAssist) {
        this.childFamilyCareAssist = childFamilyCareAssist;
    }

    public boolean isFinancialAssist() {
        return financialAssist;
    }

    public void setFinancialAssist(boolean financialAssist) {
        this.financialAssist = financialAssist;
    }

    public boolean isHealthAssist() {
        return healthAssist;
    }

    public void setHealthAssist(boolean healthAssist) {
        this.healthAssist = healthAssist;
    }

    public boolean isTransportationAssist() {
        return transportationAssist;
    }

    public void setTransportationAssist(boolean transportationAssist) {
        this.transportationAssist = transportationAssist;
    }

    public boolean isBusinessAttireAssist() {
        return businessAttireAssist;
    }

    public void setBusinessAttireAssist(boolean businessAttireAssist) {
        this.businessAttireAssist = businessAttireAssist;
    }

    public boolean isLegalAssist() {
        return legalAssist;
    }

    public void setLegalAssist(boolean legalAssist) {
        this.legalAssist = legalAssist;
    }

    public boolean isOtherAssist() {
        return otherAssist;
    }

    public void setOtherAssist(boolean otherAssist) {
        this.otherAssist = otherAssist;
    }

    public boolean isLocalCareerOneStop() {
        return localCareerOneStop;
    }

    public void setLocalCareerOneStop(boolean localCareerOneStop) {
        this.localCareerOneStop = localCareerOneStop;
    }

    public boolean isMcEmploymentService() {
        return mcEmploymentService;
    }

    public void setMcEmploymentService(boolean mcEmploymentService) {
        this.mcEmploymentService = mcEmploymentService;
    }

    public boolean isPOAC() {
        return POAC;
    }

    public void setPOAC(boolean POAC) {
        this.POAC = POAC;
    }

    public boolean isLocalIndustryNetGroup() {
        return localIndustryNetGroup;
    }

    public void setLocalIndustryNetGroup(boolean localIndustryNetGroup) {
        this.localIndustryNetGroup = localIndustryNetGroup;
    }

    public boolean isProfAssociations() {
        return profAssociations;
    }

    public void setProfAssociations(boolean profAssociations) {
        this.profAssociations = profAssociations;
    }

    public boolean isMdWorkforceExchange() {
        return mdWorkforceExchange;
    }

    public void setMdWorkforceExchange(boolean mdWorkforceExchange) {
        this.mdWorkforceExchange = mdWorkforceExchange;
    }

    public boolean isLinkedin() {
        return linkedin;
    }

    public void setLinkedin(boolean linkedin) {
        this.linkedin = linkedin;
    }

    public String getLtCareerGoal() {
        return ltCareerGoal;
    }

    public void setLtCareerGoal(String ltCareerGoal) {
        this.ltCareerGoal = ltCareerGoal;
    }

    public String getPositionAppy() {
        return positionAppy;
    }

    public void setPositionAppy(String positionAppy) {
        this.positionAppy = positionAppy;
    }

    public String getSkillsExp() {
        return skillsExp;
    }

    public void setSkillsExp(String skillsExp) {
        this.skillsExp = skillsExp;
    }

    public String getTrainingNeeded() {
        return trainingNeeded;
    }

    public void setTrainingNeeded(String trainingNeeded) {
        this.trainingNeeded = trainingNeeded;
    }

    public String getTasksYoullEnjoy() {
        return tasksYoullEnjoy;
    }

    public void setTasksYoullEnjoy(String tasksYoullEnjoy) {
        this.tasksYoullEnjoy = tasksYoullEnjoy;
    }

    public String getSeeGrowth() {
        return seeGrowth;
    }

    public void setSeeGrowth(String seeGrowth) {
        this.seeGrowth = seeGrowth;
    }

    public String getTwoAreagrowth() {
        return twoAreagrowth;
    }

    public void setTwoAreagrowth(String twoAreagrowth) {
        this.twoAreagrowth = twoAreagrowth;
    }

    public String getDiredWage() {
        return diredWage;
    }

    public void setDiredWage(String diredWage) {
        this.diredWage = diredWage;
    }

    public String getDesiredLocal() {
        return desiredLocal;
    }

    public void setDesiredLocal(String desiredLocal) {
        this.desiredLocal = desiredLocal;
    }
}
