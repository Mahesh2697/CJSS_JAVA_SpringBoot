public class BenefitsDetails {
    private int benefitId;
    private String benefitName;
    private String description;

    public BenefitsDetails(int benefitId, String benefitName, String description) {
        this.benefitId = benefitId;
        this.benefitName = benefitName;
        this.description = description;
    }


    public int getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(int benefitId) {
        this.benefitId = benefitId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
