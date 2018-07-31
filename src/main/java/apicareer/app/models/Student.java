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

    //Education Training Prof Development
    private String postSecondaryEd;
    private String ProfessionalCertifications;

    //Current Recent Employment
    private String employer;
    private String wage;
    private String industry;
    private String position;
    private String otherExperience;
    private String reasonForLeaving;

    private String preventsEmployment;

    private String transportation;
    private boolean driversLiscense;

    //Basic  Resources, supportive needs
    private boolean housingAssist;
    private boolean childFamilyCareAssist;
    private boolean financialAssist;
    private boolean healthAssist;
    private boolean transportationAssist;
    private boolean businessAttireAssist;
    private boolean legalAssist;
    private boolean otherAssist;
    private boolean foodAssist;
    private boolean transportAssist;

    //Career Goals
    private String ltCareerGoal;
    private String positionAppy;
    private String skillsExp;
    private String trainingNeeded;
    private String tasksYoullEnjoy;
    private String seeGrowth;
    private String twoAreagrowth;

    //Employment preferences
    private boolean healthInsurance;
    private boolean dental;
    private boolean visionInsurance;
    private boolean vacationSickLeave;
    private boolean retirementPlan;
    private boolean fullTime;
    private boolean parttime;
    private boolean contractor;
    private boolean selfEmploy;
    private boolean weekdaysOnly;
    private boolean dayHoursOnly;
    private boolean flexSchedule;
    private String diredWage;
    private String desiredLocal;

    //Program Participation
    private boolean meetNavigator;
    private boolean committed2LTEmploy;
    private boolean committed2contactCoordinator;
    private boolean useReferrals;
    private boolean willing2takeOnJobTraining;

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

    public String getPreventsEmployment() {
        return preventsEmployment;
    }

    public void setPreventsEmployment(String preventsEmployment) {
        this.preventsEmployment = preventsEmployment;
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

    public boolean isHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(boolean healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public boolean isDental() {
        return dental;
    }

    public void setDental(boolean dental) {
        this.dental = dental;
    }

    public boolean isVisionInsurance() {
        return visionInsurance;
    }

    public void setVisionInsurance(boolean visionInsurance) {
        this.visionInsurance = visionInsurance;
    }

    public boolean isVacationSickLeave() {
        return vacationSickLeave;
    }

    public void setVacationSickLeave(boolean vacationSickLeave) {
        this.vacationSickLeave = vacationSickLeave;
    }

    public boolean isRetirementPlan() {
        return retirementPlan;
    }

    public void setRetirementPlan(boolean retirementPlan) {
        this.retirementPlan = retirementPlan;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public boolean isParttime() {
        return parttime;
    }

    public void setParttime(boolean parttime) {
        this.parttime = parttime;
    }

    public boolean isContractor() {
        return contractor;
    }

    public void setContractor(boolean contractor) {
        this.contractor = contractor;
    }

    public boolean isSelfEmploy() {
        return selfEmploy;
    }

    public void setSelfEmploy(boolean selfEmploy) {
        this.selfEmploy = selfEmploy;
    }

    public boolean isWeekdaysOnly() {
        return weekdaysOnly;
    }

    public void setWeekdaysOnly(boolean weekdaysOnly) {
        this.weekdaysOnly = weekdaysOnly;
    }

    public boolean isDayHoursOnly() {
        return dayHoursOnly;
    }

    public void setDayHoursOnly(boolean dayHoursOnly) {
        this.dayHoursOnly = dayHoursOnly;
    }

    public boolean isFlexSchedule() {
        return flexSchedule;
    }

    public void setFlexSchedule(boolean flexSchedule) {
        this.flexSchedule = flexSchedule;
    }

    public boolean isMeetNavigator() {
        return meetNavigator;
    }

    public void setMeetNavigator(boolean meetNavigator) {
        this.meetNavigator = meetNavigator;
    }

    public boolean isCommitted2LTEmploy() {
        return committed2LTEmploy;
    }

    public void setCommitted2LTEmploy(boolean committed2LTEmploy) {
        this.committed2LTEmploy = committed2LTEmploy;
    }

    public boolean isCommitted2contactCoordinator() {
        return committed2contactCoordinator;
    }

    public void setCommitted2contactCoordinator(boolean committed2contactCoordinator) {
        this.committed2contactCoordinator = committed2contactCoordinator;
    }

    public boolean isUseReferrals() {
        return useReferrals;
    }

    public void setUseReferrals(boolean useReferrals) {
        this.useReferrals = useReferrals;
    }

    public boolean isWilling2takeOnJobTraining() {
        return willing2takeOnJobTraining;
    }

    public void setWilling2takeOnJobTraining(boolean willing2takeOnJobTraining) {
        this.willing2takeOnJobTraining = willing2takeOnJobTraining;
    }

    public boolean isFoodAssist() {
        return foodAssist;
    }

    public void setFoodAssist(boolean foodAssist) {
        this.foodAssist = foodAssist;
    }

    public boolean isTransportAssist() {
        return transportAssist;
    }

    public void setTransportAssist(boolean transportAssist) {
        this.transportAssist = transportAssist;
    }
}
