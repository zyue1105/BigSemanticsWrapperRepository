package ecologylab.semantics.generated.library.wikipedia;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.generated.library.wikipedia.WikiAnchor;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;

/**
*  Paragraph.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Paragraph extends Metadata
{
	/** 
	 * Anchors (links) in the paragraph, typically links to another Wikipedia article.
	 */ 
	@simpl_collection("wiki_anchor")	@mm_name("anchors")
	private List<WikiAnchor> anchors;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString paragraphText;

	public Paragraph()
	{ }

	public Paragraph(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<WikiAnchor> getAnchors()
	{
		return anchors;
	}

	public void setAnchors(List<WikiAnchor> anchors)
	{
		this.anchors = anchors;
	}

	public MetadataString	paragraphText()
	{
		MetadataString	result = this.paragraphText;
		if (result == null)
		{
			result = new MetadataString();
			this.paragraphText = result;
		}
		return result;
	}

	public String getParagraphText()
	{
		return this.paragraphText == null ? null : paragraphText().getValue();
	}

	public MetadataString getParagraphTextMetadata()
	{
		return paragraphText;
	}

	public void setParagraphText(String paragraphText)
	{
		if (paragraphText != null)
			this.paragraphText().setValue(paragraphText);
	}

	public void setParagraphTextMetadata(MetadataString paragraphText)
	{
		this.paragraphText = paragraphText;
	}
}
