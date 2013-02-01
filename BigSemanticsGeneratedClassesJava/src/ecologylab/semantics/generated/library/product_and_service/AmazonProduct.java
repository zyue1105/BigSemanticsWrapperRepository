package ecologylab.semantics.generated.library.product_and_service;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.product_and_service.AmazonList;
import ecologylab.semantics.generated.library.product_and_service.AmazonProduct;
import ecologylab.semantics.generated.library.product_and_service.Product;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class AmazonProduct extends Product
{
	@simpl_composite
	@mm_name("department")
	private Document department;

	@simpl_composite
	@mm_name("bestseller_list_rank")
	private AmazonList bestsellerListRank;

	@simpl_collection("amazon_product")
	@mm_name("people_also_buy")
	private List<AmazonProduct> peopleAlsoBuy;

	@simpl_collection("document")
	@mm_name("list_mania")
	private List<Document> listMania;

	public AmazonProduct()
	{ super(); }

	public AmazonProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Document getDepartment()
	{
		return department;
	}

	public void setDepartment(Document department)
	{
		this.department = department;
	}

	public AmazonList getBestsellerListRank()
	{
		return bestsellerListRank;
	}

	public void setBestsellerListRank(AmazonList bestsellerListRank)
	{
		this.bestsellerListRank = bestsellerListRank;
	}

	public List<AmazonProduct> getPeopleAlsoBuy()
	{
		return peopleAlsoBuy;
	}

  // lazy evaluation:
  public List<AmazonProduct> peopleAlsoBuy()
  {
    if (peopleAlsoBuy == null)
      peopleAlsoBuy = new ArrayList<AmazonProduct>();
    return peopleAlsoBuy;
  }

  // addTo:
  public void addToPeopleAlsoBuy(AmazonProduct element)
  {
    peopleAlsoBuy().add(element);
  }

  // size:
  public int peopleAlsoBuySize()
  {
    return peopleAlsoBuy == null ? 0 : peopleAlsoBuy.size();
  }

	public void setPeopleAlsoBuy(List<AmazonProduct> peopleAlsoBuy)
	{
		this.peopleAlsoBuy = peopleAlsoBuy;
	}

	public List<Document> getListMania()
	{
		return listMania;
	}

  // lazy evaluation:
  public List<Document> listMania()
  {
    if (listMania == null)
      listMania = new ArrayList<Document>();
    return listMania;
  }

  // addTo:
  public void addToListMania(Document element)
  {
    listMania().add(element);
  }

  // size:
  public int listManiaSize()
  {
    return listMania == null ? 0 : listMania.size();
  }

	public void setListMania(List<Document> listMania)
	{
		this.listMania = listMania;
	}
}