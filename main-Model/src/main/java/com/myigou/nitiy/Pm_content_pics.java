package com.myigou.nitiy;

/**
 * 
 * @author hou
 */
public class Pm_content_pics {
	/**
	 *  内容主表uuid
	 */
	private Integer id;
	/**
	 *  图片主键
	 */
	private String pmCpSysuuid;
	/**
	 *  
	 */
	private String pmConSysuuid;
	/**
	 *  
	 */
	private String pmPicUrl;
	/**
	 *  
	 */
	private String pmPicTitle;
	/**
	 *  
	 */
	private String pmPicDesc;
	/**
	 *  关联图片url
	 */
	private String pmRelateUrl;
	/**
	 *  
	 */
	private Integer pmPicOrder;
	/**
	 * 内容主表uuid
	 * @param id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	
    /**
     * 内容主表uuid
     * @return
     */	
    public Integer getId(){
    	return id;
    }
	/**
	 * 图片主键
	 * @param pmCpSysuuid
	 */
	public void setPmCpSysuuid(String pmCpSysuuid){
		this.pmCpSysuuid = pmCpSysuuid;
	}
	
    /**
     * 图片主键
     * @return
     */	
    public String getPmCpSysuuid(){
    	return pmCpSysuuid;
    }
	/**
	 * 
	 * @param pmConSysuuid
	 */
	public void setPmConSysuuid(String pmConSysuuid){
		this.pmConSysuuid = pmConSysuuid;
	}
	
    /**
     * 
     * @return
     */	
    public String getPmConSysuuid(){
    	return pmConSysuuid;
    }
	/**
	 * 
	 * @param pmPicUrl
	 */
	public void setPmPicUrl(String pmPicUrl){
		this.pmPicUrl = pmPicUrl;
	}
	
    /**
     * 
     * @return
     */	
    public String getPmPicUrl(){
    	return pmPicUrl;
    }
	/**
	 * 
	 * @param pmPicTitle
	 */
	public void setPmPicTitle(String pmPicTitle){
		this.pmPicTitle = pmPicTitle;
	}
	
    /**
     * 
     * @return
     */	
    public String getPmPicTitle(){
    	return pmPicTitle;
    }
	/**
	 * 
	 * @param pmPicDesc
	 */
	public void setPmPicDesc(String pmPicDesc){
		this.pmPicDesc = pmPicDesc;
	}
	
    /**
     * 
     * @return
     */	
    public String getPmPicDesc(){
    	return pmPicDesc;
    }
	/**
	 * 关联图片url
	 * @param pmRelateUrl
	 */
	public void setPmRelateUrl(String pmRelateUrl){
		this.pmRelateUrl = pmRelateUrl;
	}
	
    /**
     * 关联图片url
     * @return
     */	
    public String getPmRelateUrl(){
    	return pmRelateUrl;
    }
	/**
	 * 
	 * @param pmPicOrder
	 */
	public void setPmPicOrder(Integer pmPicOrder){
		this.pmPicOrder = pmPicOrder;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getPmPicOrder(){
    	return pmPicOrder;
    }
}