//
// AskNatureSubgroup.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.AskNatureNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.AskNatureNS 
{
	[SimplInherit]
	public class AskNatureSubgroup : CompoundDocument
	{
		[SimplCollection("function")]
		[MmName("functions")]
		private List<AskNatureFunction> functions;

		public AskNatureSubgroup()
		{ }

		public AskNatureSubgroup(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<AskNatureFunction> Functions
		{
			get{return functions;}
			set
			{
				if (this.functions != value)
				{
					this.functions = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
