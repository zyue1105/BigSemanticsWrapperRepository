package ecologylab.semantics.generated.library.search;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.googleBooks.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.publication.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableMetadata;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	Bing image search result.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class BingImageSearchResult
extends ImageInSearchResult
{

@simpl_composite @xml_tag("mms:Thumbnail") @mm_name("thumbnail")
private ImageInSearchResult	thumbnail;



/**
	Constructor
*/
public BingImageSearchResult()
{
 super();
}

/**
	Constructor
*/
public BingImageSearchResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for thumbnail
*/
public ImageInSearchResult	thumbnail()
{
	ImageInSearchResult	result = this.thumbnail;
	if (result == null)
	{
		result = new ImageInSearchResult();
		this.thumbnail = result;
	}
	return result;
}

/**
	Get the value of field thumbnail
*/
public ImageInSearchResult getThumbnail()
{
	return this.thumbnail;
}

/**
	Set the value of field thumbnail
*/
public void setThumbnail(ImageInSearchResult thumbnail)
{
	this.thumbnail = thumbnail;
}


}
