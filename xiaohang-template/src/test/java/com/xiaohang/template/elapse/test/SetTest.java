package com.xiaohang.template.elapse.test;

import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.xiaohang.template.core.Template;
import com.xiaohang.template.core.TemplateEngine;
import com.xiaohang.template.elapse.ElapseTemplateEngine;

/**
 * @author xiaohanghu
 */
public class SetTest {

	public static void main(String[] args) {
		InputStream in = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("template/elapse/set_test.html");

		TemplateEngine templateEngine = new ElapseTemplateEngine();
		Template template = templateEngine.createTemplate(in, "GBK");
		StringWriter sb = new StringWriter();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msgid", 123654);
		template.render(map, sb);
		System.out.println(sb.toString());

	}

}
