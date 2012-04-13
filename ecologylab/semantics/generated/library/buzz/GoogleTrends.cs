//
// GoogleTrends.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.buzz;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.buzz 
{
	/// <summary>
	/// Google trends
	/// </summary>
	[SimplInherit]
	public class GoogleTrends : CompoundDocument
	{
		[SimplCollection("hot_search")]
		[SimplNoWrap]
		[MmName("hot_searches")]
		private List<HotSearch> hotSearches;

		public GoogleTrends()
		{ }

		public GoogleTrends(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<HotSearch> HotSearches
		{
			get{return hotSearches;}
			set
			{
				if (this.hotSearches != value)
				{
					this.hotSearches = value;
					this.RaisePropertyChanged( () => this.HotSearches );
				}
			}
		}
	}
}