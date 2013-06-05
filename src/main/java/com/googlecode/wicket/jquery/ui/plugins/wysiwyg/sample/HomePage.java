package com.googlecode.wicket.jquery.ui.plugins.wysiwyg.sample;


import com.googlecode.wicket.jquery.ui.plugins.wysiwyg.WysiwygDefaultToolbar;
import com.googlecode.wicket.jquery.ui.plugins.wysiwyg.WysiwygEditor;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class HomePage extends WebPage{
	private static final long serialVersionUID=1L;
	String value="Type";
	WysiwygEditor wysiwygEditor;
	WysiwygDefaultToolbar wysiwygDefaultToolbar;

	public HomePage(final PageParameters parameters){
		super(parameters);

		Form form=new Form("form");
		form.add(new AjaxButton("submitBtn"){
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form){
				System.out.println(wysiwygEditor.getModelObject());
				System.out.println(value);
			}

		}) ;

		wysiwygDefaultToolbar=new WysiwygDefaultToolbar("toolbarContainer");
		form.add(wysiwygDefaultToolbar);
		wysiwygEditor=new WysiwygEditor("editorContainer",new Model<String>(value),wysiwygDefaultToolbar);
		form.add(wysiwygEditor);
		this.add(form);
	}
}
