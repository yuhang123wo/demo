package cn.yh.study.base.domain;

/**
 *
 * This class was generated by MyBatis Generator. This class corresponds to the
 * database table role_auth
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class RoleAuth extends Entity {
	private static final long serialVersionUID = -5249373672806255561L;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column role_auth.role_id
	 *
	 * @mbggenerated
	 */
	private Integer roleId;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column role_auth.auth_id
	 *
	 * @mbggenerated
	 */
	private Integer authId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column role_auth.role_id
	 *
	 * @return the value of role_auth.role_id
	 *
	 * @mbggenerated
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column role_auth.role_id
	 *
	 * @param roleId
	 *            the value for role_auth.role_id
	 *
	 * @mbggenerated
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column role_auth.auth_id
	 *
	 * @return the value of role_auth.auth_id
	 *
	 * @mbggenerated
	 */
	public Integer getAuthId() {
		return authId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column role_auth.auth_id
	 *
	 * @param authId
	 *            the value for role_auth.auth_id
	 *
	 * @mbggenerated
	 */
	public void setAuthId(Integer authId) {
		this.authId = authId;
	}
}