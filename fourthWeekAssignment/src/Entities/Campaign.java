package Entities;

import java.util.Date;

public class Campaign {
    private String campaingName;
    private String detail;
    private int discount;
    private Date startDate;
    private Date finishDate;

    public Campaign(String campaingName, String detail, int discount, Date startDate, Date finishDate) {
        this.campaingName = campaingName;
        this.detail = detail;
        this.discount = discount;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public String getCampaingName() {
        return campaingName;
    }

    public void setCampaingName(String campaingName) {
        this.campaingName = campaingName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
}
