//
// NsfProgram.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.GrantNS;
using Ecologylab.Semantics.Generated.Library.NsfNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.NsfNS 
{
	[SimplInherit]
	public class NsfProgram : GrantProgram
	{
		[SimplComposite]
		[MmName("grants_by_search")]
		private NsfSearch grantsBySearch;

		[SimplComposite]
		[MmName("funding_history")]
		private NsfSearch fundingHistory;

		public NsfProgram()
		{ }

		public NsfProgram(MetaMetadataCompositeField mmd) : base(mmd) { }


		public NsfSearch GrantsBySearch
		{
			get{return grantsBySearch;}
			set
			{
				if (this.grantsBySearch != value)
				{
					this.grantsBySearch = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public NsfSearch FundingHistory
		{
			get{return fundingHistory;}
			set
			{
				if (this.fundingHistory != value)
				{
					this.fundingHistory = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
