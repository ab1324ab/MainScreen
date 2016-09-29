package com.myigou.nitiy;

/**
 * 
 * @author hou
 */
public class Pm_content {
	/**
	 *  
	 */
	private Integer id;
	/**
	 *  业务主键
	 */
	private String pmConSysuuid;
	/**
	 *  类目表的业务主键
	 */
	private String pmCgSysuuid;
	/**
	 *  商家ID
	 */
	private String pmMchId;
	/**
	 *  内容大图
	 */
	private String pmPicBigUrl;
	/**
	 *  内容小图
	 */
	private String pmPicSmallUrl;
	/**
	 *  标题
	 */
	private String pmTitle;
	/**
	 *  配置新闻的内容
	 */
	private String pmDesc;
	/**
	 *  
	 */
	private String pmCreateUserId;
	/**
	 *  
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
	 *  加的阅读量 每天加200  初始化一个值
	 */
	private Long pmFakeRead;
	/**
	 *  假的点赞量 每天加200 初始化时随机生成
	 */
	private Long pmFakeLike;
	/**
	 *  界面暂时浏览量 每天加200-300随机数 初始化时随机生成
	 */
	private Long pmFakeShare;
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
	 * @param pmConSysuuid
	 */
	public void setPmConSysuuid(String pmConSysuuid){
		this.pmConSysuuid = pmConSysuuid;
	}
	
    /**
     * 业务主键
     * @return
     */	
    public String getPmConSysuuid(){
    	return pmConSysuuid;
    }
	/**
	 * 类目表的业务主键
	 * @param pmCgSysuuid
	 */
	public void setPmCgSysuuid(String pmCgSysuuid){
		this.pmCgSysuuid = pmCgSysuuid;
	}
	
    /**
     * 类目表的业务主键
     * @return
     */	
    public String getPmCgSysuuid(){
    	return pmCgSysuuid;
    }
	/**
	 * 商家ID
	 * @param pmMchId
	 */
	public void setPmMchId(String pmMchId){
		this.pmMchId = pmMchId;
	}
	
    /**
     * 商家ID
     * @return
     */	
    public String getPmMchId(){
    	return pmMchId;
    }
	/**
	 * 内容大图
	 * @param pmPicBigUrl
	 */
	public void setPmPicBigUrl(String pmPicBigUrl){
		this.pmPicBigUrl = pmPicBigUrl;
	}
	
    /**
     * 内容大图
     * @return
     */	
    public String getPmPicBigUrl(){
    	return pmPicBigUrl;
    }
	/**
	 * 内容小图
	 * @param pmPicSmallUrl
	 */
	public void setPmPicSmallUrl(String pmPicSmallUrl){
		this.pmPicSmallUrl = pmPicSmallUrl;
	}
	
    /**
     * 内容小图
     * @return
     */	
    public String getPmPicSmallUrl(){
    	return pmPicSmallUrl;
    }
	/**
	 * 标题
	 * @param pmTitle
	 */
	public void setPmTitle(String pmTitle){
		this.pmTitle = pmTitle;
	}
	
    /**
     * 标题
     * @return
     */	
    public String getPmTitle(){
    	return pmTitle;
    }
	/**
	 * 配置新闻的内容
	 * @param pmDesc
	 */
	public void setPmDesc(String pmDesc){
		this.pmDesc = pmDesc;
	}
	
    /**
     * 配置新闻的内容
     * @return
     */	
    public String getPmDesc(){
    	return pmDesc;
    }
	/**
	 * 
	 * @param pmCreateUserId
	 */
	public void setPmCreateUserId(String pmCreateUserId){
		this.pmCreateUserId = pmCreateUserId;
	}
	
    /**
     * 
     * @return
     */	
    public String getPmCreateUserId(){
    	return pmCreateUserId;
    }
	/**
	 * 
	 * @param pmCreateTime
	 */
	public void setPmCreateTime(java.util.Date pmCreateTime){
		this.pmCreateTime = pmCreateTime;
	}
	
    /**
     * 
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
	/**
	 * 加的阅读量 每天加200  初始化一个值
	 * @param pmFakeRead
	 */
	public void setPmFakeRead(Long pmFakeRead){
		this.pmFakeRead = pmFakeRead;
	}
	
    /**
     * 加的阅读量 每天加200  初始化一个值
     * @return
     */	
    public Long getPmFakeRead(){
    	return pmFakeRead;
    }
	/**
	 * 假的点赞量 每天加200 初始化时随机生成
	 * @param pmFakeLike
	 */
	public void setPmFakeLike(Long pmFakeLike){
		this.pmFakeLike = pmFakeLike;
	}
	
    /**
     * 假的点赞量 每天加200 初始化时随机生成
     * @return
     */	
    public Long getPmFakeLike(){
    	return pmFakeLike;
    }
	/**
	 * 界面暂时浏览量 每天加200-300随机数 初始化时随机生成
	 * @param pmFakeShare
	 */
	public void setPmFakeShare(Long pmFakeShare){
		this.pmFakeShare = pmFakeShare;
	}
	
    /**
     * 界面暂时浏览量 每天加200-300随机数 初始化时随机生成
     * @return
     */	
    public Long getPmFakeShare(){
    	return pmFakeShare;
    }
}