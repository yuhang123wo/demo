package cn.yh.study.base.domain;

import javax.persistence.Column;

import org.apache.commons.lang3.builder.ToStringBuilder;

@SuppressWarnings("serial")
public class Entity implements java.io.Serializable {
	@Column(name = "id")
	private Long id;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
