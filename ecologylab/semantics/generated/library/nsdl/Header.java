package ecologylab.semantics.generated.library.nsdl;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  Header.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/27/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Header extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("resourceIdentifier")	
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL resourceIdentifier;

	public Header()
	{ }

	public Header(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	resourceIdentifier()
	{
		MetadataParsedURL	result = this.resourceIdentifier;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.resourceIdentifier = result;
		}
		return result;
	}

	public ParsedURL getResourceIdentifier()
	{
		return this.resourceIdentifier == null ? null : resourceIdentifier().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getResourceIdentifierMetadata()
	{
		return resourceIdentifier;
	}

	public void setResourceIdentifier(ParsedURL resourceIdentifier)
	{
		if (resourceIdentifier != null)
			this.resourceIdentifier().setValue(resourceIdentifier);
	}

	public void setResourceIdentifierMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL resourceIdentifier)
	{
		this.resourceIdentifier = resourceIdentifier;
	}
}
