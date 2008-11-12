package ecologylab.semantics.library.scholarlyPublication;

 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;

public class Author extends Metadata{

/**
	Constructor
**/ 

public Author()
{
}
/**
	Constructor
**/ 

public Author(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
/**
	
**/ 

	@xml_tag("name") @xml_nested private MetadataString	name;
/**
	Lazy Evaluation for name
**/ 

MetadataString	name()
{
MetadataString	result	=this.name;
if(result == null)
{
result = new MetadataString();
this.name	=	 result;
}
return result;
}
/**
	Gets the value of the field name
**/ 

public String getName(){
return name().getValue();
}
/**
	Sets the value of the field name
**/ 

public void setName( String name )
{
this.name().setValue(name);
}
/**
	The heavy weight setter method for field name
**/ 

public void hwSetName( String name )
{
this.name().setValue(name);
rebuildCompositeTermVector();
 }/**
	
**/ 

	@xml_tag("affiliation") @xml_nested private MetadataString	affiliation;
/**
	Lazy Evaluation for affiliation
**/ 

MetadataString	affiliation()
{
MetadataString	result	=this.affiliation;
if(result == null)
{
result = new MetadataString();
this.affiliation	=	 result;
}
return result;
}
/**
	Gets the value of the field affiliation
**/ 

public String getAffiliation(){
return affiliation().getValue();
}
/**
	Sets the value of the field affiliation
**/ 

public void setAffiliation( String affiliation )
{
this.affiliation().setValue(affiliation);
}
/**
	The heavy weight setter method for field affiliation
**/ 

public void hwSetAffiliation( String affiliation )
{
this.affiliation().setValue(affiliation);
rebuildCompositeTermVector();
 }/**
	
**/ 

	@xml_tag("results_page") @xml_nested private MetadataParsedURL	resultsPage;
/**
	Lazy Evaluation for resultsPage
**/ 

MetadataParsedURL	resultsPage()
{
MetadataParsedURL	result	=this.resultsPage;
if(result == null)
{
result = new MetadataParsedURL();
this.resultsPage	=	 result;
}
return result;
}
/**
	Gets the value of the field resultsPage
**/ 

public ParsedURL getResultsPage(){
return resultsPage().getValue();
}
/**
	Sets the value of the field resultsPage
**/ 

public void setResultsPage( ParsedURL resultsPage )
{
this.resultsPage().setValue(resultsPage);
}
/**
	The heavy weight setter method for field resultsPage
**/ 

public void hwSetResultsPage( ParsedURL resultsPage )
{
this.resultsPage().setValue(resultsPage);
rebuildCompositeTermVector();
 }}