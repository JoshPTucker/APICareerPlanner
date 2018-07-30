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
    private boolean profAssociations

    private String ltCareerGoal;
    private String positionAppy;
    private String skillsExp;













}
