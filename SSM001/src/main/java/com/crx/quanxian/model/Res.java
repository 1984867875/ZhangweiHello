package com.crx.quanxian.model;

public class Res {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res.resid
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    private Integer resid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res.rename
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    private String rename;
    private String logo;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res.pid
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res.pname
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    private String pname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res.url
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res.resid
     *
     * @return the value of res.resid
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    public Integer getResid() {
        return resid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res.resid
     *
     * @param resid the value for res.resid
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    public void setResid(Integer resid) {
        this.resid = resid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res.rename
     *
     * @return the value of res.rename
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    public String getRename() {
        return rename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res.rename
     *
     * @param rename the value for res.rename
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    public void setRename(String rename) {
        this.rename = rename == null ? null : rename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res.pid
     *
     * @return the value of res.pid
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res.pid
     *
     * @param pid the value for res.pid
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res.pname
     *
     * @return the value of res.pname
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    public String getPname() {
        return pname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res.pname
     *
     * @param pname the value for res.pname
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res.url
     *
     * @return the value of res.url
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res.url
     *
     * @param url the value for res.url
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}