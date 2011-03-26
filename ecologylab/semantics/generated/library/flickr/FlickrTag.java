package ecologylab.semantics.generated.library.flickr;


import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class FlickrTag
extends Metadata
{

@simpl_scalar @simpl_composite_as_scalar
private MetadataString	tagName;

@simpl_scalar
private MetadataParsedURL	tagLink;



/**
	Constructor
*/
public FlickrTag()
{
 super();
}

/**
	Constructor
*/
public FlickrTag(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for tagName
*/
public MetadataString	tagName()
{
	MetadataString	result = this.tagName;
	if (result == null)
	{
		result = new MetadataString();
		this.tagName = result;
	}
	return result;
}

/**
	Gets the value of the field tagName
*/
public String getTagName()
{
	return this.tagName().getValue();
}

/**
	Sets the value of the field tagName
*/
public void setTagName(String tagName)
{
	this.tagName().setValue(tagName);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: tagName
*/
public boolean isNullTagName()
{
	return tagName == null || tagName.getValue() == null;
}

/**
	The heavy weight setter method for field tagName
*/
public void hwSetTagName(String tagName)
{
	this.tagName().setValue(tagName);
	rebuildCompositeTermVector();
}

/**
	 Sets the tagName directly.
*/
public void setTagNameMetadata(MetadataString tagName)
{
	this.tagName = tagName;
}

/**
	Heavy Weight Direct setter method for tagName
*/
public void hwSetTagNameMetadata(MetadataString tagName)
{
	if (this.tagName != null && this.tagName.getValue() != null && hasTermVector())
		termVector().remove(this.tagName.termVector());
	this.tagName = tagName;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for tagLink
*/
public MetadataParsedURL	tagLink()
{
	MetadataParsedURL	result = this.tagLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.tagLink = result;
	}
	return result;
}

/**
	Gets the value of the field tagLink
*/
public ParsedURL getTagLink()
{
	return this.tagLink().getValue();
}

/**
	Sets the value of the field tagLink
*/
public void setTagLink(ParsedURL tagLink)
{
	this.tagLink().setValue(tagLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: tagLink
*/
public boolean isNullTagLink()
{
	return tagLink == null || tagLink.getValue() == null;
}

/**
	The heavy weight setter method for field tagLink
*/
public void hwSetTagLink(ParsedURL tagLink)
{
	this.tagLink().setValue(tagLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the tagLink directly.
*/
public void setTagLinkMetadata(MetadataParsedURL tagLink)
{
	this.tagLink = tagLink;
}

/**
	Heavy Weight Direct setter method for tagLink
*/
public void hwSetTagLinkMetadata(MetadataParsedURL tagLink)
{
	if (this.tagLink != null && this.tagLink.getValue() != null && hasTermVector())
		termVector().remove(this.tagLink.termVector());
	this.tagLink = tagLink;
	rebuildCompositeTermVector();
}


}

