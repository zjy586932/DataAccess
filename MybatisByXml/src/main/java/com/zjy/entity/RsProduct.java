package com.zjy.entity;


public class RsProduct {

  private long productId;
  private long productCatId;
  private long productSeriesId;
  private String productName;
  private long brandId;
  private String machineCode;
  private long supplierId;
  private long status;
  private String productImg;
  private String productDesc;
  private long warrantyTime;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String outProductId;
  private String outProductSeriesId;
  private long productType;


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getProductCatId() {
    return productCatId;
  }

  public void setProductCatId(long productCatId) {
    this.productCatId = productCatId;
  }


  public long getProductSeriesId() {
    return productSeriesId;
  }

  public void setProductSeriesId(long productSeriesId) {
    this.productSeriesId = productSeriesId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
  }


  public String getMachineCode() {
    return machineCode;
  }

  public void setMachineCode(String machineCode) {
    this.machineCode = machineCode;
  }


  public long getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(long supplierId) {
    this.supplierId = supplierId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getProductImg() {
    return productImg;
  }

  public void setProductImg(String productImg) {
    this.productImg = productImg;
  }


  public String getProductDesc() {
    return productDesc;
  }

  public void setProductDesc(String productDesc) {
    this.productDesc = productDesc;
  }


  public long getWarrantyTime() {
    return warrantyTime;
  }

  public void setWarrantyTime(long warrantyTime) {
    this.warrantyTime = warrantyTime;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public String getOutProductId() {
    return outProductId;
  }

  public void setOutProductId(String outProductId) {
    this.outProductId = outProductId;
  }


  public String getOutProductSeriesId() {
    return outProductSeriesId;
  }

  public void setOutProductSeriesId(String outProductSeriesId) {
    this.outProductSeriesId = outProductSeriesId;
  }


  public long getProductType() {
    return productType;
  }

  public void setProductType(long productType) {
    this.productType = productType;
  }

}
