package com.googlecode.wicket.jquery.ui.plugins.wysiwyg.sample;

import com.googlecode.wicket.jquery.ui.WysiwygEditor;
import com.googlecode.wicket.jquery.ui.WysiwygText;
import com.googlecode.wicket.jquery.ui.plugins.wysiwyg.WysiwygBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.ajax.markup.html.form.AjaxSubmitLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class HomePage extends WebPage{
	private static final long serialVersionUID=1L;

	public HomePage(final PageParameters parameters){
		super(parameters);

		final WysiwygEditor wysiwygEditor=new WysiwygEditor("editorContainer",new Model<WysiwygText>());
		this.add(wysiwygEditor);
	}
}
