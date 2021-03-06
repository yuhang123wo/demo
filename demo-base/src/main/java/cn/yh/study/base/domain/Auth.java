package cn.yh.study.base.domain;

/**
 *
 * This class was generated by MyBatis Generator. This class corresponds to the
 * database table auth
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class Auth extends Entity {

	private static final long serialVersionUID = 6109088205862140549L;
	private String name;
	private String authUrl;
	private Integer type;
	private Integer pId;

	public static final int type_menu = 1;// 菜单
	public static final int type_button = 2;// 按钮

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the authUrl
	 */
	public String getAuthUrl() {
		return authUrl;
	}

	/**
	 * @param authUrl
	 *            the authUrl to set
	 */
	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}

	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the pId
	 */
	public Integer getpId() {
		return pId;
	}

	/**
	 * @param pId
	 *            the pId to set
	 */
	public void setpId(Integer pId) {
		this.pId = pId;
	}

}