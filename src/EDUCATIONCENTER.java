import java.time.LocalDate;
public abstract class EDUCATIONCENTER {
    private String NAME;
    private String LOCATEDCOUNTRY;
    private LocalDate FOUNDATIONYEAR;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getLOCATEDCOUNTRY() {
        return LOCATEDCOUNTRY;
    }

    public void setLOCATEDCOUNTRY(String LOCATEDCOUNTRY) {
        this.LOCATEDCOUNTRY = LOCATEDCOUNTRY;
    }

    public LocalDate getFOUNDATIONYEAR() {
        return FOUNDATIONYEAR;
    }

    public void setFOUNDATIONYEAR(LocalDate FOUNDATIONYEAR) {
        this.FOUNDATIONYEAR = FOUNDATIONYEAR;
    }

    public EDUCATIONCENTER(String NAME, String LOCATEDCOUNTRY, LocalDate FOUNDATIONYEAR) {
        this.NAME = NAME;
        this.LOCATEDCOUNTRY = LOCATEDCOUNTRY;
        this.FOUNDATIONYEAR = FOUNDATIONYEAR;

    }
}
