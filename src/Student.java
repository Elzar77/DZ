import java.time.LocalDate;
public class Student {
    private String NAME;
    private String SURNAME;
    private String GENDER;
    private LocalDate DATEOFSTART;
    private EDUCATIONCENTER EDUCATIONCENTER;

    public Student(String NAME, String SURNAME, String GENDER, LocalDate DATEOFSTART, EDUCATIONCENTER EDUCATIONCENTER) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.GENDER = GENDER;
        this.DATEOFSTART = DATEOFSTART;
        this.EDUCATIONCENTER = EDUCATIONCENTER;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public LocalDate getDATEOFSTART() {
        return DATEOFSTART;
    }

    public void setDATEOFSTART(LocalDate DATEOFSTART) {
        this.DATEOFSTART = DATEOFSTART;
    }

    public EDUCATIONCENTER getEDUCATIONCENTER() {
        return EDUCATIONCENTER;
    }

    public void setEDUCATIONCENTER(EDUCATIONCENTER EDUCATIONCENTER) {
        this.EDUCATIONCENTER = EDUCATIONCENTER;
    }
}
