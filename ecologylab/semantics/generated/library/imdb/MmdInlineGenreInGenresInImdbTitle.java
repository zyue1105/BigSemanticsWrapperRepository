package ecologylab.semantics.generated.library.imdb;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineGenreInGenresInImdbTitle.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/15/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineGenreInGenresInImdbTitle extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL genreLink;

	/** 
	 */ 
	@simpl_scalar	private MetadataString name;

	public MmdInlineGenreInGenresInImdbTitle()
	{ }

	public MmdInlineGenreInGenresInImdbTitle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataParsedURL	genreLink()
	{
		MetadataParsedURL	result = this.genreLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.genreLink = result;
		}
		return result;
	}

	public ParsedURL getGenreLink()
	{
		return this.genreLink().getValue();
	}

	public void setGenreLink(ParsedURL genreLink)
	{
		this.genreLink().setValue(genreLink);
	}

	public MetadataString	name()
	{
		MetadataString	result = this.name;
		if (result == null)
		{
			result = new MetadataString();
			this.name = result;
		}
		return result;
	}

	public String getName()
	{
		return this.name().getValue();
	}

	public void setName(String name)
	{
		this.name().setValue(name);
	}

}
