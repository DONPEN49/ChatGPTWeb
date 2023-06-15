package java.web.chatgpt.model;

import java.io.Serializable;

public class ChatModel implements Serializable {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
