package ecologylab.semantics.generated.library.artwork;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.camera.*;
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
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.ImageClipping;
import ecologylab.semantics.metadata.builtins.MediaClipping;
import ecologylab.semantics.metadata.builtins.TextClipping;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.tools.MetaMetadataCompilerUtils;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class MomaList
extends CompoundDocument
{

@simpl_collection("moma_artwork") @simpl_nowrap @mm_name("artworks")
private ArrayList<MomaArtwork>	artworks;

@simpl_scalar
private MetadataParsedURL	nextList;



/**
	Constructor
*/
public MomaList()
{
 super();
}

/**
	Constructor
*/
public MomaList(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for artworks
*/
public ArrayList<MomaArtwork>	artworks()
{
	ArrayList<MomaArtwork>	result = this.artworks;
	if (result == null)
	{
		result = new ArrayList<MomaArtwork>();
		this.artworks = result;
	}
	return result;
}

/**
	Get the value of field artworks
*/
public ArrayList<MomaArtwork> getArtworks()
{
	return this.artworks;
}

/**
	Set the value of field artworks
*/
public void setArtworks(ArrayList<MomaArtwork> artworks)
{
	this.artworks = artworks;
}

/**
	Lazy evaluation for nextList
*/
public MetadataParsedURL	nextList()
{
	MetadataParsedURL	result = this.nextList;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.nextList = result;
	}
	return result;
}

/**
	Gets the value of the field nextList
*/
public ParsedURL getNextList()
{
	return this.nextList().getValue();
}

/**
	Sets the value of the field nextList
*/
public void setNextList(ParsedURL nextList)
{
	this.nextList().setValue(nextList);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: nextList
*/
public boolean isNullNextList()
{
	return nextList == null || nextList.getValue() == null;
}

/**
	The heavy weight setter method for field nextList
*/
public void hwSetNextList(ParsedURL nextList)
{
	this.nextList().setValue(nextList);
	rebuildCompositeTermVector();
}

/**
	 Sets the nextList directly.
*/
public void setNextListMetadata(MetadataParsedURL nextList)
{
	this.nextList = nextList;
}

/**
	Heavy Weight Direct setter method for nextList
*/
public void hwSetNextListMetadata(MetadataParsedURL nextList)
{
	if (this.nextList != null && this.nextList.getValue() != null && hasTermVector())
		termVector().remove(this.nextList.termVector());
	this.nextList = nextList;
	rebuildCompositeTermVector();
}


}
