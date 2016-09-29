package com.myigou.nitiy;

/**
 * 
 * @author hou
 */
public class Pm_category {
	/**
	 *  
	 */
	private Integer id;
	/**
	 *  业务主键
	 */
	private String pmCgSysuuid;
	/**
	 *  分类名称
	 */
	private String pmName;
	/**
	 *  商家id
	 */
	private String pmMchId;
	/**
	 *  大图
	 */
	private String pmPicBigUrl;
	/**
	 *  小图
	 */
	private String pmPicSmallUrl;
	/**
	 *  标示  演示标示 分类
	 */
	private String pmFlag;
	/**
	 *  创建者
	 */
	private String pmCreateUserId;
	/**
	 *  创建时间
	 */
	private java.util.Date pmCreateTime;
	/**
	 *  
	 */
	private String pmUpdateUserId;
	/**
	 *  
	 */
	private java.util.Date pmUpdateTime;
	/**
	 *  是否删除 默认为1 正常  0代表删除
	 */
	private String pmDel;
	/**
	 * 
	 * @param id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getId(){
    	return id;
    }
	/**
	 * 业务主键
	 * @param pmCgSysuuid
	 */
	public void setPmCgSysuuid(String pmCgSysuuid){
		this.pmCgSysuuid = pmCgSysuuid;
	}
	
    /**
     * 业务主键
     * @return
     */	
    public String getPmCgSysuuid(){
    	return pmCgSysuuid;
    }
	/**
	 * 分类名称
	 * @param pmName
	 */
	public void setPmName(String pmName){
		this.pmName = pmName;
	}
	
    /**
     * 分类名称
     * @return
     */	
    public String getPmName(){
    	return pmName;
    }
	/**
	 * 商家id
	 * @param pmMchId
	 */
	public void setPmMchId(String pmMchId){
		this.pmMchId = pmMchId;
	}
	
    /**
     * 商家id
     * @return
     */	
    public String getPmMchId(){
    	return pmMchId;
    }
	/**
	 * 大图
	 * @param pmPicBigUrl
	 */
	public void setPmPicBigUrl(String pmPicBigUrl){
		this.pmPicBigUrl = pmPicBigUrl;
	}
	
    /**
     * 大图
     * @return
     */	
    public String getPmPicBigUrl(){
    	return pmPicBigUrl;
    }
	/**
	 * 小图
	 * @param pmPicSmallUrl
	 */
	public void setPmPicSmallUrl(String pmPicSmallUrl){
		this.pmPicSmallUrl = pmPicSmallUrl;
	}
	
    /**
     * 小图
     * @return
     */	
    public String getPmPicSmallUrl(){
    	return pmPicSmallUrl;
    }
	/**
	 * 标示  演示标示 分类
	 * @param pmFlag
	 */
	public void setPmFlag(String pmFlag){
		this.pmFlag = pmFlag;
	}
	
    /**
     * 标示  演示标示 分类
     * @return
     */	
    public String getPmFlag(){
    	return pmFlag;
    }
	/**
	 * 创建者
	 * @param pmCreateUserId
	 */
	public void setPmCreateUserId(String pmCreateUserId){
		this.pmCreateUserId = pmCreateUserId;
	}
	
    /**
     * 创建者
     * @return
     */	
    public String getPmCreateUserId(){
    	return pmCreateUserId;
    }
	/**
	 * 创建时间
	 * @param pmCreateTime
	 */
	public void setPmCreateTime(java.util.Date pmCreateTime){
		this.pmCreateTime = pmCreateTime;
	}
	
    /**
     * 创建时间
     * @return
     */	
    public java.util.Date getPmCreateTime(){
    	return pmCreateTime;
    }
	/**
	 * 
	 * @param pmUpdateUserId
	 */
	public void setPmUpdateUserId(String pmUpdateUserId){
		this.pmUpdateUserId = pmUpdateUserId;
	}
	
    /**
     * 
     * @return
     */	
    public String getPmUpdateUserId(){
    	return pmUpdateUserId;
    }
	/**
	 * 
	 * @param pmUpdateTime
	 */
	public void setPmUpdateTime(java.util.Date pmUpdateTime){
		this.pmUpdateTime = pmUpdateTime;
	}
	
    /**
     * 
     * @return
     */	
    public java.util.Date getPmUpdateTime(){
    	return pmUpdateTime;
    }
	/**
	 * 是否删除 默认为1 正常  0代表删除
	 * @param pmDel
	 */
	public void setPmDel(String pmDel){
		this.pmDel = pmDel;
	}
	
    /**
     * 是否删除 默认为1 正常  0代表删除
     * @return
     */	
    public String getPmDel(){
    	return pmDel;
    }
}