package com.xiaohang.template.core.parser.scanner.token;

/**
 * @author xiaohanghu
 * */
public class ExpressionToken implements Token {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{className:'ExpressionToken',content:'");
		builder.append(content);
		builder.append("'}");
		return builder.toString();
	}

}
