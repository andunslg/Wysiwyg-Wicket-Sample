package com.googlecode.wicket.jquery.ui.plugins.wysiwyg.sample;

import com.googlecode.wicket.jquery.ui.plugins.wysiwyg.WysiwygEditor;
import com.googlecode.wicket.jquery.ui.plugins.wysiwyg.toolbar.DefaultWysiwygToolbar;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.util.Locale;


public class Editor extends WebPage{
	private static final long serialVersionUID=1L;
	String value="Type";
	WysiwygEditor wysiwygEditor;
	DefaultWysiwygToolbar wysiwygDefaultToolbar;

	public Editor(PageParameters parameters){

		super(parameters);


		Form form=new Form("form");
		form.add(new AjaxButton("submitBtn"){
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form){
				System.out.println(wysiwygEditor.getModelObject());
				System.out.println(value);
			}

		}) ;

		form.add(new Link("english")
		{
			@Override
			public void onClick()
			{
				getSession().setLocale(new Locale("english"));
			}
		});
		form.add(new Link("russian")
		{
			@Override
			public void onClick()
			{
				getSession().setLocale(new Locale("russian"));
			}
		});
		form.add(new Link("spanish")
		{
			@Override
			public void onClick()
			{
				getSession().setLocale(new Locale("spanish"));
			}
		});
		form.add(new Link("french")
		{
			@Override
			public void onClick()
			{
				getSession().setLocale(new Locale("french"));
			}
		});

		wysiwygDefaultToolbar=new DefaultWysiwygToolbar("toolbarContainer");
		form.add(wysiwygDefaultToolbar);
		wysiwygEditor=new WysiwygEditor("editorContainer",new Model<String>(value),wysiwygDefaultToolbar);
		form.add(wysiwygEditor);
		this.add(form);

	}
}
