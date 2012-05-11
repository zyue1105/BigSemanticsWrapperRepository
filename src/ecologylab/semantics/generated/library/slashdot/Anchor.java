package ecologylab.semantics.generated.library.slashdot;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Anchor extends Metadata
{
	@simpl_scalar
	private MetadataString anchorText;

	@simpl_scalar
	private MetadataParsedURL link;

	public Anchor()
	{ super(); }

	public Anchor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	anchorText()
	{
		MetadataString	result = this.anchorText;
		if (result == null)
		{
			result = new MetadataString();
			this.anchorText = result;
		}
		return result;
	}

	public String getAnchorText()
	{
		return this.anchorText == null ? null : anchorText().getValue();
	}

	public MetadataString getAnchorTextMetadata()
	{
		return anchorText;
	}

	public void setAnchorText(String anchorText)
	{
		if (anchorText != null)
			this.anchorText().setValue(anchorText);
	}

	public void setAnchorTextMetadata(MetadataString anchorText)
	{
		this.anchorText = anchorText;
	}

	public MetadataParsedURL	link()
	{
		MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ParsedURL getLink()
	{
		return this.link == null ? null : link().getValue();
	}

	public MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(MetadataParsedURL link)
	{
		this.link = link;
	}
}