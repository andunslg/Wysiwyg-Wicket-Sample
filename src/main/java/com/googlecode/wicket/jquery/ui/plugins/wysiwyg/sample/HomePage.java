package com.googlecode.wicket.jquery.ui.plugins.wysiwyg.sample;

import com.googlecode.wicket.jquery.ui.WysiwygEditor;
import com.googlecode.wicket.jquery.ui.plugins.wysiwyg.WysiwygBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);
		this.add(new WysiwygBehavior("#editor","wysiwyg"));
		this.add(new WysiwygEditor("container"));
	}
}
