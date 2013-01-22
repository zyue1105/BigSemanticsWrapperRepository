//
// SearchSection.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.DleseNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.DleseNS 
{
	[SimplInherit]
	public class SearchSection : Metadata
	{
		[SimplComposite]
		[SimplTag("resultInfo")]
		[MmName("result_info")]
		private ResultInfo resultInfo;

		[SimplCollection("record")]
		[SimplTag("results")]
		[MmName("search_results")]
		private List<DleseRecord1> searchResults;

		public SearchSection()
		{ }

		public SearchSection(MetaMetadataCompositeField mmd) : base(mmd) { }


		public ResultInfo ResultInfo
		{
			get{return resultInfo;}
			set
			{
				if (this.resultInfo != value)
				{
					this.resultInfo = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<DleseRecord1> SearchResults
		{
			get{return searchResults;}
			set
			{
				if (this.searchResults != value)
				{
					this.searchResults = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}