//
// NsfProgramStaffList.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
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
	public class NsfProgramStaffList : CompoundDocument
	{
		[SimplCollection("staff")]
		[MmName("staffs")]
		private List<NsfStaff> staffs;

		public NsfProgramStaffList()
		{ }

		public NsfProgramStaffList(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<NsfStaff> Staffs
		{
			get{return staffs;}
			set
			{
				if (this.staffs != value)
				{
					this.staffs = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}