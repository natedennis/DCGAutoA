package org.dcg.auto.data.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "credit", catalog = "dcg_auto")
public class Credit implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8879019994789166286L;
    private Integer id;
    private String dest;
    private Date createDate;
    private String firstname;
    private String middlename;
    private String lastname;
    private String custemail;
    private String ssn;
    private String dob;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone1;
    private String phone2;
    private String phone3;
    private String timehere;
    private String statushere;
    private String mortgagepay;
    private String relname;
    private String relmid;
    private String rellast;
    private String relstreet;
    private String relcity;
    private String relstate;
    private String relzip;
    private String relphone;
    private String companyname;
    private String fedtaxno;
    private String companystate;
    private String timeinbus;
    private String employername;
    private String employercontact;
    private String employerphone;
    private String employstatus;
    private String timeemploy;
    private String companyunit;
    private String companyphone;
    private String companycontact;
    private String noyearsex;
    private String noyearsstatus;
    private String licenseno;
    private String bankname;
    private String bankcity;
    private String bankstate;
    private String bankacctno;
    private String bankphone;
    private String bankcontact;
    private String eq1year;
    private String eq1make;
    private String eq1model;
    private String eq1bank;
    private String eq1acct;
    private String eq1phone;
    private String eq2year;
    private String eq2make;
    private String eq2model;
    private String eq2bank;
    private String eq2acct;
    private String eq2phone;
    private String eq3year;
    private String eq3make;
    private String eq3model;
    private String eq3bank;
    private String eq3acct;
    private String eq3phone;
    private String notes;
    private String agree;
    private String dateofinc;
    private String percentown;
    private String corptitle;
    private String priortimeemploy;
    private String prioremployername;
    private String prioremployercontact;
    private String prioremployerphone;
    private String priorworkstatus;
    private String noautoowned;
    private String noyearsowned;
    private String noyearscd;
    private String eq1status;
    private String eq2status;
    private String eq3status;
    private String salesman;
    private String stockNumber;
    private String stockNum;

    public Credit() {
    }

    public Credit(String firstname, String middlename, String lastname, String custemail) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.custemail = custemail;
    }

    public Credit(String dest, Date createDate, String firstname, String middlename, String lastname, String custemail, String ssn, String dob, String street,
            String city, String state, String zip, String phone1, String phone2, String phone3, String timehere, String statushere, String mortgagepay,
            String relname, String relmid, String rellast, String relstreet, String relcity, String relstate, String relzip, String relphone,
            String companyname, String fedtaxno, String companystate, String timeinbus, String employername, String employercontact, String employerphone,
            String employstatus, String timeemploy, String companyunit, String companyphone, String companycontact, String noyearsex, String noyearsstatus,
            String licenseno, String bankname, String bankcity, String bankstate, String bankacctno, String bankphone, String bankcontact, String eq1year,
            String eq1make, String eq1model, String eq1bank, String eq1acct, String eq1phone, String eq2year, String eq2make, String eq2model, String eq2bank,
            String eq2acct, String eq2phone, String eq3year, String eq3make, String eq3model, String eq3bank, String eq3acct, String eq3phone, String notes,
            String agree, String dateofinc, String percentown, String corptitle, String priortimeemploy, String prioremployername, String prioremployercontact,
            String prioremployerphone, String priorworkstatus, String noautoowned, String noyearsowned, String noyearscd, String eq1status, String eq2status,
            String eq3status, String salesman, String stockNumber, String stockNum) {
        this.dest = dest;
        this.createDate = createDate;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.custemail = custemail;
        this.ssn = ssn;
        this.dob = dob;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.phone3 = phone3;
        this.timehere = timehere;
        this.statushere = statushere;
        this.mortgagepay = mortgagepay;
        this.relname = relname;
        this.relmid = relmid;
        this.rellast = rellast;
        this.relstreet = relstreet;
        this.relcity = relcity;
        this.relstate = relstate;
        this.relzip = relzip;
        this.relphone = relphone;
        this.companyname = companyname;
        this.fedtaxno = fedtaxno;
        this.companystate = companystate;
        this.timeinbus = timeinbus;
        this.employername = employername;
        this.employercontact = employercontact;
        this.employerphone = employerphone;
        this.employstatus = employstatus;
        this.timeemploy = timeemploy;
        this.companyunit = companyunit;
        this.companyphone = companyphone;
        this.companycontact = companycontact;
        this.noyearsex = noyearsex;
        this.noyearsstatus = noyearsstatus;
        this.licenseno = licenseno;
        this.bankname = bankname;
        this.bankcity = bankcity;
        this.bankstate = bankstate;
        this.bankacctno = bankacctno;
        this.bankphone = bankphone;
        this.bankcontact = bankcontact;
        this.eq1year = eq1year;
        this.eq1make = eq1make;
        this.eq1model = eq1model;
        this.eq1bank = eq1bank;
        this.eq1acct = eq1acct;
        this.eq1phone = eq1phone;
        this.eq2year = eq2year;
        this.eq2make = eq2make;
        this.eq2model = eq2model;
        this.eq2bank = eq2bank;
        this.eq2acct = eq2acct;
        this.eq2phone = eq2phone;
        this.eq3year = eq3year;
        this.eq3make = eq3make;
        this.eq3model = eq3model;
        this.eq3bank = eq3bank;
        this.eq3acct = eq3acct;
        this.eq3phone = eq3phone;
        this.notes = notes;
        this.agree = agree;
        this.dateofinc = dateofinc;
        this.percentown = percentown;
        this.corptitle = corptitle;
        this.priortimeemploy = priortimeemploy;
        this.prioremployername = prioremployername;
        this.prioremployercontact = prioremployercontact;
        this.prioremployerphone = prioremployerphone;
        this.priorworkstatus = priorworkstatus;
        this.noautoowned = noautoowned;
        this.noyearsowned = noyearsowned;
        this.noyearscd = noyearscd;
        this.eq1status = eq1status;
        this.eq2status = eq2status;
        this.eq3status = eq3status;
        this.salesman = salesman;
        this.stockNumber = stockNumber;
        this.stockNum = stockNum;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "dest", length = 80)
    public String getDest() {
        return this.dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "create_date", length = 10)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "firstname", nullable = false, length = 40)
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "middlename", nullable = false, length = 40)
    public String getMiddlename() {
        return this.middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Column(name = "lastname", nullable = false, length = 40)
    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name = "custemail", nullable = false, length = 80)
    public String getCustemail() {
        return this.custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    @Column(name = "ssn", length = 9)
    public String getSsn() {
        return this.ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Column(name = "dob", length = 25)
    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Column(name = "street", length = 100)
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "city", length = 40)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "state", length = 2)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "zip", length = 12)
    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Column(name = "phone1", length = 20)
    public String getPhone1() {
        return this.phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Column(name = "phone2", length = 20)
    public String getPhone2() {
        return this.phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Column(name = "phone3", length = 20)
    public String getPhone3() {
        return this.phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    @Column(name = "timehere", length = 15)
    public String getTimehere() {
        return this.timehere;
    }

    public void setTimehere(String timehere) {
        this.timehere = timehere;
    }

    @Column(name = "statushere", length = 20)
    public String getStatushere() {
        return this.statushere;
    }

    public void setStatushere(String statushere) {
        this.statushere = statushere;
    }

    @Column(name = "mortgagepay", length = 75)
    public String getMortgagepay() {
        return this.mortgagepay;
    }

    public void setMortgagepay(String mortgagepay) {
        this.mortgagepay = mortgagepay;
    }

    @Column(name = "relname", length = 40)
    public String getRelname() {
        return this.relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    @Column(name = "relmid", length = 40)
    public String getRelmid() {
        return this.relmid;
    }

    public void setRelmid(String relmid) {
        this.relmid = relmid;
    }

    @Column(name = "rellast", length = 40)
    public String getRellast() {
        return this.rellast;
    }

    public void setRellast(String rellast) {
        this.rellast = rellast;
    }

    @Column(name = "relstreet", length = 100)
    public String getRelstreet() {
        return this.relstreet;
    }

    public void setRelstreet(String relstreet) {
        this.relstreet = relstreet;
    }

    @Column(name = "relcity", length = 40)
    public String getRelcity() {
        return this.relcity;
    }

    public void setRelcity(String relcity) {
        this.relcity = relcity;
    }

    @Column(name = "relstate", length = 2)
    public String getRelstate() {
        return this.relstate;
    }

    public void setRelstate(String relstate) {
        this.relstate = relstate;
    }

    @Column(name = "relzip", length = 12)
    public String getRelzip() {
        return this.relzip;
    }

    public void setRelzip(String relzip) {
        this.relzip = relzip;
    }

    @Column(name = "relphone", length = 20)
    public String getRelphone() {
        return this.relphone;
    }

    public void setRelphone(String relphone) {
        this.relphone = relphone;
    }

    @Column(name = "companyname", length = 75)
    public String getCompanyname() {
        return this.companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Column(name = "fedtaxno", length = 30)
    public String getFedtaxno() {
        return this.fedtaxno;
    }

    public void setFedtaxno(String fedtaxno) {
        this.fedtaxno = fedtaxno;
    }

    @Column(name = "companystate", length = 2)
    public String getCompanystate() {
        return this.companystate;
    }

    public void setCompanystate(String companystate) {
        this.companystate = companystate;
    }

    @Column(name = "timeinbus", length = 15)
    public String getTimeinbus() {
        return this.timeinbus;
    }

    public void setTimeinbus(String timeinbus) {
        this.timeinbus = timeinbus;
    }

    @Column(name = "employername", length = 65)
    public String getEmployername() {
        return this.employername;
    }

    public void setEmployername(String employername) {
        this.employername = employername;
    }

    @Column(name = "employercontact", length = 40)
    public String getEmployercontact() {
        return this.employercontact;
    }

    public void setEmployercontact(String employercontact) {
        this.employercontact = employercontact;
    }

    @Column(name = "employerphone", length = 20)
    public String getEmployerphone() {
        return this.employerphone;
    }

    public void setEmployerphone(String employerphone) {
        this.employerphone = employerphone;
    }

    @Column(name = "employstatus", length = 20)
    public String getEmploystatus() {
        return this.employstatus;
    }

    public void setEmploystatus(String employstatus) {
        this.employstatus = employstatus;
    }

    @Column(name = "timeemploy", length = 20)
    public String getTimeemploy() {
        return this.timeemploy;
    }

    public void setTimeemploy(String timeemploy) {
        this.timeemploy = timeemploy;
    }

    @Column(name = "companyunit", length = 75)
    public String getCompanyunit() {
        return this.companyunit;
    }

    public void setCompanyunit(String companyunit) {
        this.companyunit = companyunit;
    }

    @Column(name = "companyphone", length = 20)
    public String getCompanyphone() {
        return this.companyphone;
    }

    public void setCompanyphone(String companyphone) {
        this.companyphone = companyphone;
    }

    @Column(name = "companycontact", length = 40)
    public String getCompanycontact() {
        return this.companycontact;
    }

    public void setCompanycontact(String companycontact) {
        this.companycontact = companycontact;
    }

    @Column(name = "noyearsex", length = 20)
    public String getNoyearsex() {
        return this.noyearsex;
    }

    public void setNoyearsex(String noyearsex) {
        this.noyearsex = noyearsex;
    }

    @Column(name = "noyearsstatus", length = 20)
    public String getNoyearsstatus() {
        return this.noyearsstatus;
    }

    public void setNoyearsstatus(String noyearsstatus) {
        this.noyearsstatus = noyearsstatus;
    }

    @Column(name = "licenseno", length = 30)
    public String getLicenseno() {
        return this.licenseno;
    }

    public void setLicenseno(String licenseno) {
        this.licenseno = licenseno;
    }

    @Column(name = "bankname", length = 75)
    public String getBankname() {
        return this.bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Column(name = "bankcity", length = 40)
    public String getBankcity() {
        return this.bankcity;
    }

    public void setBankcity(String bankcity) {
        this.bankcity = bankcity;
    }

    @Column(name = "bankstate", length = 2)
    public String getBankstate() {
        return this.bankstate;
    }

    public void setBankstate(String bankstate) {
        this.bankstate = bankstate;
    }

    @Column(name = "bankacctno", length = 30)
    public String getBankacctno() {
        return this.bankacctno;
    }

    public void setBankacctno(String bankacctno) {
        this.bankacctno = bankacctno;
    }

    @Column(name = "bankphone", length = 20)
    public String getBankphone() {
        return this.bankphone;
    }

    public void setBankphone(String bankphone) {
        this.bankphone = bankphone;
    }

    @Column(name = "bankcontact", length = 40)
    public String getBankcontact() {
        return this.bankcontact;
    }

    public void setBankcontact(String bankcontact) {
        this.bankcontact = bankcontact;
    }

    @Column(name = "eq1year", length = 4)
    public String getEq1year() {
        return this.eq1year;
    }

    public void setEq1year(String eq1year) {
        this.eq1year = eq1year;
    }

    @Column(name = "eq1make", length = 30)
    public String getEq1make() {
        return this.eq1make;
    }

    public void setEq1make(String eq1make) {
        this.eq1make = eq1make;
    }

    @Column(name = "eq1model", length = 40)
    public String getEq1model() {
        return this.eq1model;
    }

    public void setEq1model(String eq1model) {
        this.eq1model = eq1model;
    }

    @Column(name = "eq1bank", length = 75)
    public String getEq1bank() {
        return this.eq1bank;
    }

    public void setEq1bank(String eq1bank) {
        this.eq1bank = eq1bank;
    }

    @Column(name = "eq1acct", length = 30)
    public String getEq1acct() {
        return this.eq1acct;
    }

    public void setEq1acct(String eq1acct) {
        this.eq1acct = eq1acct;
    }

    @Column(name = "eq1phone", length = 20)
    public String getEq1phone() {
        return this.eq1phone;
    }

    public void setEq1phone(String eq1phone) {
        this.eq1phone = eq1phone;
    }

    @Column(name = "eq2year", length = 4)
    public String getEq2year() {
        return this.eq2year;
    }

    public void setEq2year(String eq2year) {
        this.eq2year = eq2year;
    }

    @Column(name = "eq2make", length = 30)
    public String getEq2make() {
        return this.eq2make;
    }

    public void setEq2make(String eq2make) {
        this.eq2make = eq2make;
    }

    @Column(name = "eq2model", length = 40)
    public String getEq2model() {
        return this.eq2model;
    }

    public void setEq2model(String eq2model) {
        this.eq2model = eq2model;
    }

    @Column(name = "eq2bank", length = 75)
    public String getEq2bank() {
        return this.eq2bank;
    }

    public void setEq2bank(String eq2bank) {
        this.eq2bank = eq2bank;
    }

    @Column(name = "eq2acct", length = 30)
    public String getEq2acct() {
        return this.eq2acct;
    }

    public void setEq2acct(String eq2acct) {
        this.eq2acct = eq2acct;
    }

    @Column(name = "eq2phone", length = 20)
    public String getEq2phone() {
        return this.eq2phone;
    }

    public void setEq2phone(String eq2phone) {
        this.eq2phone = eq2phone;
    }

    @Column(name = "eq3year", length = 4)
    public String getEq3year() {
        return this.eq3year;
    }

    public void setEq3year(String eq3year) {
        this.eq3year = eq3year;
    }

    @Column(name = "eq3make", length = 30)
    public String getEq3make() {
        return this.eq3make;
    }

    public void setEq3make(String eq3make) {
        this.eq3make = eq3make;
    }

    @Column(name = "eq3model", length = 40)
    public String getEq3model() {
        return this.eq3model;
    }

    public void setEq3model(String eq3model) {
        this.eq3model = eq3model;
    }

    @Column(name = "eq3bank", length = 75)
    public String getEq3bank() {
        return this.eq3bank;
    }

    public void setEq3bank(String eq3bank) {
        this.eq3bank = eq3bank;
    }

    @Column(name = "eq3acct", length = 30)
    public String getEq3acct() {
        return this.eq3acct;
    }

    public void setEq3acct(String eq3acct) {
        this.eq3acct = eq3acct;
    }

    @Column(name = "eq3phone", length = 20)
    public String getEq3phone() {
        return this.eq3phone;
    }

    public void setEq3phone(String eq3phone) {
        this.eq3phone = eq3phone;
    }

    @Column(name = "notes", length = 21844)
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Column(name = "agree", length = 1)
    public String getAgree() {
        return this.agree;
    }

    public void setAgree(String agree) {
        this.agree = agree;
    }

    @Column(name = "dateofinc", length = 20)
    public String getDateofinc() {
        return this.dateofinc;
    }

    public void setDateofinc(String dateofinc) {
        this.dateofinc = dateofinc;
    }

    @Column(name = "percentown", length = 2)
    public String getPercentown() {
        return this.percentown;
    }

    public void setPercentown(String percentown) {
        this.percentown = percentown;
    }

    @Column(name = "corptitle", length = 50)
    public String getCorptitle() {
        return this.corptitle;
    }

    public void setCorptitle(String corptitle) {
        this.corptitle = corptitle;
    }

    @Column(name = "priortimeemploy", length = 10)
    public String getPriortimeemploy() {
        return this.priortimeemploy;
    }

    public void setPriortimeemploy(String priortimeemploy) {
        this.priortimeemploy = priortimeemploy;
    }

    @Column(name = "prioremployername", length = 50)
    public String getPrioremployername() {
        return this.prioremployername;
    }

    public void setPrioremployername(String prioremployername) {
        this.prioremployername = prioremployername;
    }

    @Column(name = "prioremployercontact", length = 50)
    public String getPrioremployercontact() {
        return this.prioremployercontact;
    }

    public void setPrioremployercontact(String prioremployercontact) {
        this.prioremployercontact = prioremployercontact;
    }

    @Column(name = "prioremployerphone", length = 20)
    public String getPrioremployerphone() {
        return this.prioremployerphone;
    }

    public void setPrioremployerphone(String prioremployerphone) {
        this.prioremployerphone = prioremployerphone;
    }

    @Column(name = "priorworkstatus", length = 30)
    public String getPriorworkstatus() {
        return this.priorworkstatus;
    }

    public void setPriorworkstatus(String priorworkstatus) {
        this.priorworkstatus = priorworkstatus;
    }

    @Column(name = "noautoowned", length = 4)
    public String getNoautoowned() {
        return this.noautoowned;
    }

    public void setNoautoowned(String noautoowned) {
        this.noautoowned = noautoowned;
    }

    @Column(name = "noyearsowned", length = 2)
    public String getNoyearsowned() {
        return this.noyearsowned;
    }

    public void setNoyearsowned(String noyearsowned) {
        this.noyearsowned = noyearsowned;
    }

    @Column(name = "noyearscd", length = 2)
    public String getNoyearscd() {
        return this.noyearscd;
    }

    public void setNoyearscd(String noyearscd) {
        this.noyearscd = noyearscd;
    }

    @Column(name = "eq1status", length = 20)
    public String getEq1status() {
        return this.eq1status;
    }

    public void setEq1status(String eq1status) {
        this.eq1status = eq1status;
    }

    @Column(name = "eq2status", length = 20)
    public String getEq2status() {
        return this.eq2status;
    }

    public void setEq2status(String eq2status) {
        this.eq2status = eq2status;
    }

    @Column(name = "eq3status", length = 20)
    public String getEq3status() {
        return this.eq3status;
    }

    public void setEq3status(String eq3status) {
        this.eq3status = eq3status;
    }

    @Column(name = "salesman", length = 250)
    public String getSalesman() {
        return this.salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    @Column(name = "stock_number", length = 250)
    public String getStockNumber() {
        return this.stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    @Column(name = "stock_num", length = 20)
    public String getStockNum() {
        return this.stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum;
    }

}
