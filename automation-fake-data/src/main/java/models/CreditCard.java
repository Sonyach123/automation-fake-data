package models;

import java.util.Date;

public class CreditCard {
    private String number;
    private Date expDate;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setExpDate(Date date) {
        this.expDate = date;
    }

    public Date getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", expDate=" + expDate +
                '}';
    }
}
