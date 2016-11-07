package com.sds.anyframe.mobile.amplt.rest.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="USER_EMAIL")
	private String userEmail;
	
	@Column(name="DETAIL")
	private String detail;
	
	@Column(name="TAG")
	private String tag;
	
	@Column(name="REG_DATE")
	private String regDate;
	
	@Column(name="PRICE")
	private int price;
	
	@Column(name="VIEW_COUNT")
	private int viewCount;
	
	@Column(name="BUY_COUNT")
	private int buyCount;

	@Column(name="OPEN_INFO_YN")
	private String openInfoYn = OpenInfoYn.Yes.value();
	
	@Column(name="DEAL_TYPE")
	private String dealType = DealType.All.value();
	
	@Column(name="STATUS")
	private String status = Status.Sale.value();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(int buyCount) {
		this.buyCount = buyCount;
	}
	public OpenInfoYn getOpenInfoYn() {
//		return openInfoYn.value();
		return OpenInfoYn.of(openInfoYn);
	}
	public void setOpenInfoYn(String openInfoYn) {
//		this.openInfoYn = OpenInfoYn.of(openInfoYn);
		this.openInfoYn = openInfoYn;
	}
	public DealType getDealType() {
//		return dealType.value();
		return DealType.of(dealType);
	}
	public void setDealType(String dealType) {
//		this.dealType = DealType.of(dealType);
		this.dealType = dealType;
	}
	public Status getStatus() {
//		return status.value();
		return Status.of(status);
	}
	public void setStatus(String status) {
//		this.status = Status.of(status);
		this.status = status;
	}
	
	@Override
	public String toString() {
		return String.format("id : {%s}, title : {%s}, userId : {%s}, price : {%d}, dealType : {%s}, openInfoYn : {%s}, detail : {%s}, tag : {%s}, regDate : {%s}, viewCount : {%d}, status : {%s}, buyCount : {%d}"
				, id
				, title
				, userEmail
				, price
				, dealType
				, openInfoYn
				, detail
				, tag
				, regDate
				, viewCount
				, status
				, buyCount);
	}
	
}
