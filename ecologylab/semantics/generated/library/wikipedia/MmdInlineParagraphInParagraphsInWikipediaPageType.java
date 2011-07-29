package ecologylab.semantics.generated.library.wikipedia;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.wikipedia.MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType;

/**
*  MmdInlineParagraphInParagraphsInWikipediaPageType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineParagraphInParagraphsInWikipediaPageType extends Metadata
{
	/** 
	 * Anchors (links) in the paragraph, typically links to another Wikipedia article.
	 */ 
	@simpl_collection("anchor") @mm_name("anchors")	private List<MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType> anchors;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString paragraphText;

	public MmdInlineParagraphInParagraphsInWikipediaPageType()
	{ }

	public MmdInlineParagraphInParagraphsInWikipediaPageType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType> getAnchors()
	{
		return anchors;
	}

	public void setAnchors(List<MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType> anchors)
	{
		this.anchors = anchors;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	paragraphText()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.paragraphText;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.paragraphText = result;
		}
		return result;
	}

	public java.lang.String getParagraphText()
	{
		return this.paragraphText == null ? null : paragraphText().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getParagraphTextMetadata()
	{
		return paragraphText;
	}

	public void setParagraphText(java.lang.String paragraphText)
	{
		if (paragraphText != null)
			this.paragraphText().setValue(paragraphText);
	}

	public void setParagraphTextMetadata(ecologylab.semantics.metadata.scalar.MetadataString paragraphText)
	{
		this.paragraphText = paragraphText;
	}
}