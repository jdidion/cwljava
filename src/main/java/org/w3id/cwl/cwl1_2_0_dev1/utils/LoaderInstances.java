package org.w3id.cwl.cwl1_2_0_dev1.utils;

import org.w3id.cwl.cwl1_2_0_dev1.*;

public class LoaderInstances {
  public static Loader<String> StringInstance = new PrimitiveLoader<String>(String.class);
  public static Loader<Integer> IntegerInstance = new PrimitiveLoader<Integer>(Integer.class);
  public static Loader<Long> LongInstance = new PrimitiveLoader<Long>(Long.class);
  public static Loader<Float> FloatInstance = new PrimitiveLoader<Float>(Float.class);
  public static Loader<Double> DoubleInstance = new PrimitiveLoader<Double>(Double.class);
  public static Loader<Boolean> BooleanInstance = new PrimitiveLoader<Boolean>(Boolean.class);
  public static Loader<Object> NullInstance = new NullLoader();
  public static Loader<Object> AnyInstance = new AnyLoader();
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.Documented> Documented =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.Documented>(
          org.w3id.cwl.cwl1_2_0_dev1.Documented.class);
  public static Loader<PrimitiveType> PrimitiveType = new EnumLoader(PrimitiveType.class);
  public static Loader<Any> Any = new EnumLoader(Any.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.RecordField> RecordField =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.RecordField>(
          org.w3id.cwl.cwl1_2_0_dev1.RecordFieldImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.RecordSchema> RecordSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.RecordSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.RecordSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.EnumSchema> EnumSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.EnumSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.EnumSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.ArraySchema> ArraySchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.ArraySchema>(
          org.w3id.cwl.cwl1_2_0_dev1.ArraySchemaImpl.class);
  public static Loader<CWLVersion> CWLVersion = new EnumLoader(CWLVersion.class);
  public static Loader<CWLType> CWLType = new EnumLoader(CWLType.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.File> File =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.File>(org.w3id.cwl.cwl1_2_0_dev1.FileImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.Directory> Directory =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.Directory>(
          org.w3id.cwl.cwl1_2_0_dev1.DirectoryImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.Labeled> Labeled =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.Labeled>(
          org.w3id.cwl.cwl1_2_0_dev1.Labeled.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.Identified> Identified =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.Identified>(
          org.w3id.cwl.cwl1_2_0_dev1.Identified.class);
  public static Loader<LoadListingEnum> LoadListingEnum = new EnumLoader(LoadListingEnum.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.LoadContents> LoadContents =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.LoadContents>(
          org.w3id.cwl.cwl1_2_0_dev1.LoadContents.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.FieldBase> FieldBase =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.FieldBase>(
          org.w3id.cwl.cwl1_2_0_dev1.FieldBase.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InputFormat> InputFormat =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InputFormat>(
          org.w3id.cwl.cwl1_2_0_dev1.InputFormat.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.OutputFormat> OutputFormat =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.OutputFormat>(
          org.w3id.cwl.cwl1_2_0_dev1.OutputFormat.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.Parameter> Parameter =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.Parameter>(
          org.w3id.cwl.cwl1_2_0_dev1.Parameter.class);
  public static Loader<Expression> Expression = new EnumLoader(Expression.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InputBinding> InputBinding =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InputBinding>(
          org.w3id.cwl.cwl1_2_0_dev1.InputBindingImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.IOSchema> IOSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.IOSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.IOSchema.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InputSchema> InputSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InputSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.InputSchema.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.OutputSchema> OutputSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.OutputSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.OutputSchema.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InputRecordField> InputRecordField =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InputRecordField>(
          org.w3id.cwl.cwl1_2_0_dev1.InputRecordFieldImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InputRecordSchema> InputRecordSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InputRecordSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.InputRecordSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InputEnumSchema> InputEnumSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InputEnumSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.InputEnumSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InputArraySchema> InputArraySchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InputArraySchema>(
          org.w3id.cwl.cwl1_2_0_dev1.InputArraySchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.OutputRecordField> OutputRecordField =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.OutputRecordField>(
          org.w3id.cwl.cwl1_2_0_dev1.OutputRecordFieldImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.OutputRecordSchema> OutputRecordSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.OutputRecordSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.OutputRecordSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.OutputEnumSchema> OutputEnumSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.OutputEnumSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.OutputEnumSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.OutputArraySchema> OutputArraySchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.OutputArraySchema>(
          org.w3id.cwl.cwl1_2_0_dev1.OutputArraySchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InputParameter> InputParameter =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InputParameter>(
          org.w3id.cwl.cwl1_2_0_dev1.InputParameter.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.OutputParameter> OutputParameter =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.OutputParameter>(
          org.w3id.cwl.cwl1_2_0_dev1.OutputParameter.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.ProcessRequirement> ProcessRequirement =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.ProcessRequirement>(
          org.w3id.cwl.cwl1_2_0_dev1.ProcessRequirement.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.Process> Process =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.Process>(
          org.w3id.cwl.cwl1_2_0_dev1.Process.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InlineJavascriptRequirement>
      InlineJavascriptRequirement =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InlineJavascriptRequirement>(
              org.w3id.cwl.cwl1_2_0_dev1.InlineJavascriptRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputSchema> CommandInputSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandInputSchema.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.SchemaDefRequirement> SchemaDefRequirement =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.SchemaDefRequirement>(
          org.w3id.cwl.cwl1_2_0_dev1.SchemaDefRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.SecondaryFileSchema> SecondaryFileSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.SecondaryFileSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.SecondaryFileSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.LoadListingRequirement> LoadListingRequirement =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.LoadListingRequirement>(
          org.w3id.cwl.cwl1_2_0_dev1.LoadListingRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.EnvironmentDef> EnvironmentDef =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.EnvironmentDef>(
          org.w3id.cwl.cwl1_2_0_dev1.EnvironmentDefImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandLineBinding> CommandLineBinding =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandLineBinding>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandLineBindingImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputBinding> CommandOutputBinding =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputBinding>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandOutputBindingImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandLineBindable> CommandLineBindable =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandLineBindable>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandLineBindableImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputRecordField> CommandInputRecordField =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputRecordField>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandInputRecordFieldImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputRecordSchema>
      CommandInputRecordSchema =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputRecordSchema>(
              org.w3id.cwl.cwl1_2_0_dev1.CommandInputRecordSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputEnumSchema> CommandInputEnumSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputEnumSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandInputEnumSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputArraySchema> CommandInputArraySchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputArraySchema>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandInputArraySchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputRecordField>
      CommandOutputRecordField =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputRecordField>(
              org.w3id.cwl.cwl1_2_0_dev1.CommandOutputRecordFieldImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputRecordSchema>
      CommandOutputRecordSchema =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputRecordSchema>(
              org.w3id.cwl.cwl1_2_0_dev1.CommandOutputRecordSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputEnumSchema> CommandOutputEnumSchema =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputEnumSchema>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandOutputEnumSchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputArraySchema>
      CommandOutputArraySchema =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputArraySchema>(
              org.w3id.cwl.cwl1_2_0_dev1.CommandOutputArraySchemaImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputParameter> CommandInputParameter =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandInputParameter>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandInputParameterImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputParameter> CommandOutputParameter =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandOutputParameter>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandOutputParameterImpl.class);
  public static Loader<stdin> stdin = new EnumLoader(stdin.class);
  public static Loader<stdout> stdout = new EnumLoader(stdout.class);
  public static Loader<stderr> stderr = new EnumLoader(stderr.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.CommandLineTool> CommandLineTool =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.CommandLineTool>(
          org.w3id.cwl.cwl1_2_0_dev1.CommandLineToolImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.DockerRequirement> DockerRequirement =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.DockerRequirement>(
          org.w3id.cwl.cwl1_2_0_dev1.DockerRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.SoftwareRequirement> SoftwareRequirement =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.SoftwareRequirement>(
          org.w3id.cwl.cwl1_2_0_dev1.SoftwareRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.SoftwarePackage> SoftwarePackage =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.SoftwarePackage>(
          org.w3id.cwl.cwl1_2_0_dev1.SoftwarePackageImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.Dirent> Dirent =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.Dirent>(
          org.w3id.cwl.cwl1_2_0_dev1.DirentImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InitialWorkDirRequirement>
      InitialWorkDirRequirement =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InitialWorkDirRequirement>(
              org.w3id.cwl.cwl1_2_0_dev1.InitialWorkDirRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.EnvVarRequirement> EnvVarRequirement =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.EnvVarRequirement>(
          org.w3id.cwl.cwl1_2_0_dev1.EnvVarRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.ShellCommandRequirement> ShellCommandRequirement =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.ShellCommandRequirement>(
          org.w3id.cwl.cwl1_2_0_dev1.ShellCommandRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.ResourceRequirement> ResourceRequirement =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.ResourceRequirement>(
          org.w3id.cwl.cwl1_2_0_dev1.ResourceRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.WorkReuse> WorkReuse =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.WorkReuse>(
          org.w3id.cwl.cwl1_2_0_dev1.WorkReuseImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.NetworkAccess> NetworkAccess =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.NetworkAccess>(
          org.w3id.cwl.cwl1_2_0_dev1.NetworkAccessImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.InplaceUpdateRequirement>
      InplaceUpdateRequirement =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.InplaceUpdateRequirement>(
              org.w3id.cwl.cwl1_2_0_dev1.InplaceUpdateRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.ToolTimeLimit> ToolTimeLimit =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.ToolTimeLimit>(
          org.w3id.cwl.cwl1_2_0_dev1.ToolTimeLimitImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.ExpressionToolOutputParameter>
      ExpressionToolOutputParameter =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.ExpressionToolOutputParameter>(
              org.w3id.cwl.cwl1_2_0_dev1.ExpressionToolOutputParameterImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.WorkflowInputParameter> WorkflowInputParameter =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.WorkflowInputParameter>(
          org.w3id.cwl.cwl1_2_0_dev1.WorkflowInputParameterImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.ExpressionTool> ExpressionTool =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.ExpressionTool>(
          org.w3id.cwl.cwl1_2_0_dev1.ExpressionToolImpl.class);
  public static Loader<LinkMergeMethod> LinkMergeMethod = new EnumLoader(LinkMergeMethod.class);
  public static Loader<PickValueMethod> PickValueMethod = new EnumLoader(PickValueMethod.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.WorkflowOutputParameter> WorkflowOutputParameter =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.WorkflowOutputParameter>(
          org.w3id.cwl.cwl1_2_0_dev1.WorkflowOutputParameterImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.Sink> Sink =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.Sink>(org.w3id.cwl.cwl1_2_0_dev1.Sink.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.WorkflowStepInput> WorkflowStepInput =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.WorkflowStepInput>(
          org.w3id.cwl.cwl1_2_0_dev1.WorkflowStepInputImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.WorkflowStepOutput> WorkflowStepOutput =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.WorkflowStepOutput>(
          org.w3id.cwl.cwl1_2_0_dev1.WorkflowStepOutputImpl.class);
  public static Loader<ScatterMethod> ScatterMethod = new EnumLoader(ScatterMethod.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.WorkflowStep> WorkflowStep =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.WorkflowStep>(
          org.w3id.cwl.cwl1_2_0_dev1.WorkflowStepImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.Workflow> Workflow =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.Workflow>(
          org.w3id.cwl.cwl1_2_0_dev1.WorkflowImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.SubworkflowFeatureRequirement>
      SubworkflowFeatureRequirement =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.SubworkflowFeatureRequirement>(
              org.w3id.cwl.cwl1_2_0_dev1.SubworkflowFeatureRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.ScatterFeatureRequirement>
      ScatterFeatureRequirement =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.ScatterFeatureRequirement>(
              org.w3id.cwl.cwl1_2_0_dev1.ScatterFeatureRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.MultipleInputFeatureRequirement>
      MultipleInputFeatureRequirement =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.MultipleInputFeatureRequirement>(
              org.w3id.cwl.cwl1_2_0_dev1.MultipleInputFeatureRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.StepInputExpressionRequirement>
      StepInputExpressionRequirement =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.StepInputExpressionRequirement>(
              org.w3id.cwl.cwl1_2_0_dev1.StepInputExpressionRequirementImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.OperationInputParameter> OperationInputParameter =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.OperationInputParameter>(
          org.w3id.cwl.cwl1_2_0_dev1.OperationInputParameterImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.OperationOutputParameter>
      OperationOutputParameter =
          new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.OperationOutputParameter>(
              org.w3id.cwl.cwl1_2_0_dev1.OperationOutputParameterImpl.class);
  public static Loader<org.w3id.cwl.cwl1_2_0_dev1.Operation> Operation =
      new RecordLoader<org.w3id.cwl.cwl1_2_0_dev1.Operation>(
          org.w3id.cwl.cwl1_2_0_dev1.OperationImpl.class);
  public static Loader<java.util.List<String>> array_of_StringInstance =
      new ArrayLoader(StringInstance);
  public static Loader<Object> union_of_NullInstance_or_StringInstance_or_array_of_StringInstance =
      new UnionLoader(new Loader[] {NullInstance, StringInstance, array_of_StringInstance});
  public static Loader<String> uri_StringInstance_True_False_None =
      new UriLoader(StringInstance, true, false, null);
  public static Loader<Object>
      union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {PrimitiveType, RecordSchema, EnumSchema, ArraySchema, StringInstance});
  public static Loader<java.util.List<Object>>
      array_of_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance =
          new ArrayLoader(
              union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance);
  public static Loader<Object>
      union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_or_array_of_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                PrimitiveType,
                RecordSchema,
                EnumSchema,
                ArraySchema,
                StringInstance,
                array_of_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance
              });
  public static Loader<Object>
      typedsl_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_or_array_of_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_2 =
          new TypeDslLoader(
              union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_or_array_of_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance,
              2);
  public static Loader<java.util.List<RecordField>> array_of_RecordField =
      new ArrayLoader(RecordField);
  public static Loader<java.util.Optional<java.util.List<Object>>> optional_array_of_RecordField =
      new OptionalLoader(array_of_RecordField);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      idmap_fields_optional_array_of_RecordField =
          new IdMapLoader(optional_array_of_RecordField, "name", "type");
  public static Loader<enum_d9cba076fca539106791a4f46d198c7fcfbdb779>
      enum_d9cba076fca539106791a4f46d198c7fcfbdb779 =
          new EnumLoader(enum_d9cba076fca539106791a4f46d198c7fcfbdb779.class);
  public static Loader<enum_d9cba076fca539106791a4f46d198c7fcfbdb779>
      typedsl_enum_d9cba076fca539106791a4f46d198c7fcfbdb779_2 =
          new TypeDslLoader(enum_d9cba076fca539106791a4f46d198c7fcfbdb779, 2);
  public static Loader<java.util.List<Object>> uri_array_of_StringInstance_True_False_None =
      new UriLoader(array_of_StringInstance, true, false, null);
  public static Loader<enum_d961d79c225752b9fadb617367615ab176b47d77>
      enum_d961d79c225752b9fadb617367615ab176b47d77 =
          new EnumLoader(enum_d961d79c225752b9fadb617367615ab176b47d77.class);
  public static Loader<enum_d961d79c225752b9fadb617367615ab176b47d77>
      typedsl_enum_d961d79c225752b9fadb617367615ab176b47d77_2 =
          new TypeDslLoader(enum_d961d79c225752b9fadb617367615ab176b47d77, 2);
  public static Loader<Object>
      uri_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_or_array_of_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_False_True_2 =
          new UriLoader(
              union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance_or_array_of_union_of_PrimitiveType_or_RecordSchema_or_EnumSchema_or_ArraySchema_or_StringInstance,
              false,
              true,
              2);
  public static Loader<enum_d062602be0b4b8fd33e69e29a841317b6ab665bc>
      enum_d062602be0b4b8fd33e69e29a841317b6ab665bc =
          new EnumLoader(enum_d062602be0b4b8fd33e69e29a841317b6ab665bc.class);
  public static Loader<enum_d062602be0b4b8fd33e69e29a841317b6ab665bc>
      typedsl_enum_d062602be0b4b8fd33e69e29a841317b6ab665bc_2 =
          new TypeDslLoader(enum_d062602be0b4b8fd33e69e29a841317b6ab665bc, 2);
  public static Loader<File_class> File_class = new EnumLoader(File_class.class);
  public static Loader<File_class> uri_File_class_False_True_None =
      new UriLoader(File_class, false, true, null);
  public static Loader<java.util.Optional<String>> optional_StringInstance =
      new OptionalLoader(StringInstance);
  public static Loader<java.util.Optional<String>> uri_optional_StringInstance_False_False_None =
      new UriLoader(optional_StringInstance, false, false, null);
  public static Loader<java.util.Optional<Long>> optional_LongInstance =
      new OptionalLoader(LongInstance);
  public static Loader<Object> union_of_File_or_Directory =
      new UnionLoader(new Loader[] {File, Directory});
  public static Loader<java.util.List<Object>> array_of_union_of_File_or_Directory =
      new ArrayLoader(union_of_File_or_Directory);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      optional_array_of_union_of_File_or_Directory =
          new OptionalLoader(array_of_union_of_File_or_Directory);
  public static Loader<java.util.Optional<String>> uri_optional_StringInstance_True_False_None =
      new UriLoader(optional_StringInstance, true, false, null);
  public static Loader<Directory_class> Directory_class = new EnumLoader(Directory_class.class);
  public static Loader<Directory_class> uri_Directory_class_False_True_None =
      new UriLoader(Directory_class, false, true, null);
  public static Loader<java.util.Optional<Boolean>> optional_BooleanInstance =
      new OptionalLoader(BooleanInstance);
  public static Loader<java.util.Optional<LoadListingEnum>> optional_LoadListingEnum =
      new OptionalLoader(LoadListingEnum);
  public static Loader<java.util.List<SecondaryFileSchema>> array_of_SecondaryFileSchema =
      new ArrayLoader(SecondaryFileSchema);
  public static Loader<Object>
      union_of_NullInstance_or_SecondaryFileSchema_or_array_of_SecondaryFileSchema =
          new UnionLoader(
              new Loader[] {NullInstance, SecondaryFileSchema, array_of_SecondaryFileSchema});
  public static Loader<Object>
      union_of_NullInstance_or_StringInstance_or_array_of_StringInstance_or_Expression =
          new UnionLoader(
              new Loader[] {NullInstance, StringInstance, array_of_StringInstance, Expression});
  public static Loader<Object>
      uri_union_of_NullInstance_or_StringInstance_or_array_of_StringInstance_or_Expression_True_False_None =
          new UriLoader(
              union_of_NullInstance_or_StringInstance_or_array_of_StringInstance_or_Expression,
              true,
              false,
              null);
  public static Loader<Object> union_of_NullInstance_or_StringInstance_or_Expression =
      new UnionLoader(new Loader[] {NullInstance, StringInstance, Expression});
  public static Loader<Object>
      uri_union_of_NullInstance_or_StringInstance_or_Expression_True_False_None =
          new UriLoader(union_of_NullInstance_or_StringInstance_or_Expression, true, false, null);
  public static Loader<Object>
      union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                CWLType, InputRecordSchema, InputEnumSchema, InputArraySchema, StringInstance
              });
  public static Loader<java.util.List<Object>>
      array_of_union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance =
          new ArrayLoader(
              union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance);
  public static Loader<Object>
      union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                CWLType,
                InputRecordSchema,
                InputEnumSchema,
                InputArraySchema,
                StringInstance,
                array_of_union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance
              });
  public static Loader<Object>
      typedsl_union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance_2 =
          new TypeDslLoader(
              union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance,
              2);
  public static Loader<java.util.List<InputRecordField>> array_of_InputRecordField =
      new ArrayLoader(InputRecordField);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      optional_array_of_InputRecordField = new OptionalLoader(array_of_InputRecordField);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      idmap_fields_optional_array_of_InputRecordField =
          new IdMapLoader(optional_array_of_InputRecordField, "name", "type");
  public static Loader<Object>
      uri_union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance_False_True_2 =
          new UriLoader(
              union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_InputRecordSchema_or_InputEnumSchema_or_InputArraySchema_or_StringInstance,
              false,
              true,
              2);
  public static Loader<Object>
      union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                CWLType, OutputRecordSchema, OutputEnumSchema, OutputArraySchema, StringInstance
              });
  public static Loader<java.util.List<Object>>
      array_of_union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance =
          new ArrayLoader(
              union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance);
  public static Loader<Object>
      union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                CWLType,
                OutputRecordSchema,
                OutputEnumSchema,
                OutputArraySchema,
                StringInstance,
                array_of_union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance
              });
  public static Loader<Object>
      typedsl_union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance_2 =
          new TypeDslLoader(
              union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance,
              2);
  public static Loader<java.util.List<OutputRecordField>> array_of_OutputRecordField =
      new ArrayLoader(OutputRecordField);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      optional_array_of_OutputRecordField = new OptionalLoader(array_of_OutputRecordField);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      idmap_fields_optional_array_of_OutputRecordField =
          new IdMapLoader(optional_array_of_OutputRecordField, "name", "type");
  public static Loader<Object>
      uri_union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance_False_True_2 =
          new UriLoader(
              union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_OutputRecordSchema_or_OutputEnumSchema_or_OutputArraySchema_or_StringInstance,
              false,
              true,
              2);
  public static Loader<java.util.Optional<Object>> optional_AnyInstance =
      new OptionalLoader(AnyInstance);
  public static Loader<Object>
      union_of_CommandInputParameter_or_WorkflowInputParameter_or_OperationInputParameter =
          new UnionLoader(
              new Loader[] {
                CommandInputParameter, WorkflowInputParameter, OperationInputParameter
              });
  public static Loader<java.util.List<Object>>
      array_of_union_of_CommandInputParameter_or_WorkflowInputParameter_or_OperationInputParameter =
          new ArrayLoader(
              union_of_CommandInputParameter_or_WorkflowInputParameter_or_OperationInputParameter);
  public static Loader<java.util.List<Object>>
      idmap_inputs_array_of_union_of_CommandInputParameter_or_WorkflowInputParameter_or_OperationInputParameter =
          new IdMapLoader(
              array_of_union_of_CommandInputParameter_or_WorkflowInputParameter_or_OperationInputParameter,
              "id",
              "type");
  public static Loader<Object>
      union_of_CommandOutputParameter_or_ExpressionToolOutputParameter_or_WorkflowOutputParameter_or_OperationOutputParameter =
          new UnionLoader(
              new Loader[] {
                CommandOutputParameter,
                ExpressionToolOutputParameter,
                WorkflowOutputParameter,
                OperationOutputParameter
              });
  public static Loader<java.util.List<Object>>
      array_of_union_of_CommandOutputParameter_or_ExpressionToolOutputParameter_or_WorkflowOutputParameter_or_OperationOutputParameter =
          new ArrayLoader(
              union_of_CommandOutputParameter_or_ExpressionToolOutputParameter_or_WorkflowOutputParameter_or_OperationOutputParameter);
  public static Loader<java.util.List<Object>>
      idmap_outputs_array_of_union_of_CommandOutputParameter_or_ExpressionToolOutputParameter_or_WorkflowOutputParameter_or_OperationOutputParameter =
          new IdMapLoader(
              array_of_union_of_CommandOutputParameter_or_ExpressionToolOutputParameter_or_WorkflowOutputParameter_or_OperationOutputParameter,
              "id",
              "type");
  public static Loader<Object>
      union_of_InlineJavascriptRequirement_or_SchemaDefRequirement_or_LoadListingRequirement_or_DockerRequirement_or_SoftwareRequirement_or_InitialWorkDirRequirement_or_EnvVarRequirement_or_ShellCommandRequirement_or_ResourceRequirement_or_WorkReuse_or_NetworkAccess_or_InplaceUpdateRequirement_or_ToolTimeLimit_or_SubworkflowFeatureRequirement_or_ScatterFeatureRequirement_or_MultipleInputFeatureRequirement_or_StepInputExpressionRequirement =
          new UnionLoader(
              new Loader[] {
                InlineJavascriptRequirement,
                SchemaDefRequirement,
                LoadListingRequirement,
                DockerRequirement,
                SoftwareRequirement,
                InitialWorkDirRequirement,
                EnvVarRequirement,
                ShellCommandRequirement,
                ResourceRequirement,
                WorkReuse,
                NetworkAccess,
                InplaceUpdateRequirement,
                ToolTimeLimit,
                SubworkflowFeatureRequirement,
                ScatterFeatureRequirement,
                MultipleInputFeatureRequirement,
                StepInputExpressionRequirement
              });
  public static Loader<java.util.List<Object>>
      array_of_union_of_InlineJavascriptRequirement_or_SchemaDefRequirement_or_LoadListingRequirement_or_DockerRequirement_or_SoftwareRequirement_or_InitialWorkDirRequirement_or_EnvVarRequirement_or_ShellCommandRequirement_or_ResourceRequirement_or_WorkReuse_or_NetworkAccess_or_InplaceUpdateRequirement_or_ToolTimeLimit_or_SubworkflowFeatureRequirement_or_ScatterFeatureRequirement_or_MultipleInputFeatureRequirement_or_StepInputExpressionRequirement =
          new ArrayLoader(
              union_of_InlineJavascriptRequirement_or_SchemaDefRequirement_or_LoadListingRequirement_or_DockerRequirement_or_SoftwareRequirement_or_InitialWorkDirRequirement_or_EnvVarRequirement_or_ShellCommandRequirement_or_ResourceRequirement_or_WorkReuse_or_NetworkAccess_or_InplaceUpdateRequirement_or_ToolTimeLimit_or_SubworkflowFeatureRequirement_or_ScatterFeatureRequirement_or_MultipleInputFeatureRequirement_or_StepInputExpressionRequirement);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      optional_array_of_union_of_InlineJavascriptRequirement_or_SchemaDefRequirement_or_LoadListingRequirement_or_DockerRequirement_or_SoftwareRequirement_or_InitialWorkDirRequirement_or_EnvVarRequirement_or_ShellCommandRequirement_or_ResourceRequirement_or_WorkReuse_or_NetworkAccess_or_InplaceUpdateRequirement_or_ToolTimeLimit_or_SubworkflowFeatureRequirement_or_ScatterFeatureRequirement_or_MultipleInputFeatureRequirement_or_StepInputExpressionRequirement =
          new OptionalLoader(
              array_of_union_of_InlineJavascriptRequirement_or_SchemaDefRequirement_or_LoadListingRequirement_or_DockerRequirement_or_SoftwareRequirement_or_InitialWorkDirRequirement_or_EnvVarRequirement_or_ShellCommandRequirement_or_ResourceRequirement_or_WorkReuse_or_NetworkAccess_or_InplaceUpdateRequirement_or_ToolTimeLimit_or_SubworkflowFeatureRequirement_or_ScatterFeatureRequirement_or_MultipleInputFeatureRequirement_or_StepInputExpressionRequirement);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      idmap_requirements_optional_array_of_union_of_InlineJavascriptRequirement_or_SchemaDefRequirement_or_LoadListingRequirement_or_DockerRequirement_or_SoftwareRequirement_or_InitialWorkDirRequirement_or_EnvVarRequirement_or_ShellCommandRequirement_or_ResourceRequirement_or_WorkReuse_or_NetworkAccess_or_InplaceUpdateRequirement_or_ToolTimeLimit_or_SubworkflowFeatureRequirement_or_ScatterFeatureRequirement_or_MultipleInputFeatureRequirement_or_StepInputExpressionRequirement =
          new IdMapLoader(
              optional_array_of_union_of_InlineJavascriptRequirement_or_SchemaDefRequirement_or_LoadListingRequirement_or_DockerRequirement_or_SoftwareRequirement_or_InitialWorkDirRequirement_or_EnvVarRequirement_or_ShellCommandRequirement_or_ResourceRequirement_or_WorkReuse_or_NetworkAccess_or_InplaceUpdateRequirement_or_ToolTimeLimit_or_SubworkflowFeatureRequirement_or_ScatterFeatureRequirement_or_MultipleInputFeatureRequirement_or_StepInputExpressionRequirement,
              "class",
              "None");
  public static Loader<java.util.List<Object>> array_of_AnyInstance = new ArrayLoader(AnyInstance);
  public static Loader<java.util.Optional<java.util.List<Object>>> optional_array_of_AnyInstance =
      new OptionalLoader(array_of_AnyInstance);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      idmap_hints_optional_array_of_AnyInstance =
          new IdMapLoader(optional_array_of_AnyInstance, "class", "None");
  public static Loader<java.util.Optional<CWLVersion>> optional_CWLVersion =
      new OptionalLoader(CWLVersion);
  public static Loader<java.util.Optional<CWLVersion>> uri_optional_CWLVersion_False_True_None =
      new UriLoader(optional_CWLVersion, false, true, null);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      optional_array_of_StringInstance = new OptionalLoader(array_of_StringInstance);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      uri_optional_array_of_StringInstance_True_False_None =
          new UriLoader(optional_array_of_StringInstance, true, false, null);
  public static Loader<String> uri_StringInstance_False_True_None =
      new UriLoader(StringInstance, false, true, null);
  public static Loader<Object>
      union_of_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema =
          new UnionLoader(
              new Loader[] {
                CommandInputRecordSchema, CommandInputEnumSchema, CommandInputArraySchema
              });
  public static Loader<java.util.List<Object>>
      array_of_union_of_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema =
          new ArrayLoader(
              union_of_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema);
  public static Loader<Object> union_of_StringInstance_or_Expression =
      new UnionLoader(new Loader[] {StringInstance, Expression});
  public static Loader<Object> union_of_NullInstance_or_BooleanInstance_or_Expression =
      new UnionLoader(new Loader[] {NullInstance, BooleanInstance, Expression});
  public static Loader<Object> union_of_NullInstance_or_IntegerInstance_or_Expression =
      new UnionLoader(new Loader[] {NullInstance, IntegerInstance, Expression});
  public static Loader<Object>
      union_of_NullInstance_or_StringInstance_or_Expression_or_array_of_StringInstance =
          new UnionLoader(
              new Loader[] {NullInstance, StringInstance, Expression, array_of_StringInstance});
  public static Loader<java.util.Optional<Expression>> optional_Expression =
      new OptionalLoader(Expression);
  public static Loader<java.util.Optional<CommandLineBinding>> optional_CommandLineBinding =
      new OptionalLoader(CommandLineBinding);
  public static Loader<Object>
      union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                CWLType,
                CommandInputRecordSchema,
                CommandInputEnumSchema,
                CommandInputArraySchema,
                StringInstance
              });
  public static Loader<java.util.List<Object>>
      array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance =
          new ArrayLoader(
              union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance);
  public static Loader<Object>
      union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                CWLType,
                CommandInputRecordSchema,
                CommandInputEnumSchema,
                CommandInputArraySchema,
                StringInstance,
                array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance
              });
  public static Loader<Object>
      typedsl_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_2 =
          new TypeDslLoader(
              union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance,
              2);
  public static Loader<java.util.List<CommandInputRecordField>> array_of_CommandInputRecordField =
      new ArrayLoader(CommandInputRecordField);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      optional_array_of_CommandInputRecordField =
          new OptionalLoader(array_of_CommandInputRecordField);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      idmap_fields_optional_array_of_CommandInputRecordField =
          new IdMapLoader(optional_array_of_CommandInputRecordField, "name", "type");
  public static Loader<Object>
      uri_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_False_True_2 =
          new UriLoader(
              union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance,
              false,
              true,
              2);
  public static Loader<Object>
      union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                CWLType,
                CommandOutputRecordSchema,
                CommandOutputEnumSchema,
                CommandOutputArraySchema,
                StringInstance
              });
  public static Loader<java.util.List<Object>>
      array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance =
          new ArrayLoader(
              union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance);
  public static Loader<Object>
      union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                CWLType,
                CommandOutputRecordSchema,
                CommandOutputEnumSchema,
                CommandOutputArraySchema,
                StringInstance,
                array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance
              });
  public static Loader<Object>
      typedsl_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_2 =
          new TypeDslLoader(
              union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance,
              2);
  public static Loader<java.util.Optional<CommandOutputBinding>> optional_CommandOutputBinding =
      new OptionalLoader(CommandOutputBinding);
  public static Loader<java.util.List<CommandOutputRecordField>> array_of_CommandOutputRecordField =
      new ArrayLoader(CommandOutputRecordField);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      optional_array_of_CommandOutputRecordField =
          new OptionalLoader(array_of_CommandOutputRecordField);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      idmap_fields_optional_array_of_CommandOutputRecordField =
          new IdMapLoader(optional_array_of_CommandOutputRecordField, "name", "type");
  public static Loader<Object>
      uri_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_False_True_2 =
          new UriLoader(
              union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance,
              false,
              true,
              2);
  public static Loader<Object>
      union_of_CWLType_or_stdin_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                CWLType,
                stdin,
                CommandInputRecordSchema,
                CommandInputEnumSchema,
                CommandInputArraySchema,
                StringInstance,
                array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance
              });
  public static Loader<Object>
      typedsl_union_of_CWLType_or_stdin_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_2 =
          new TypeDslLoader(
              union_of_CWLType_or_stdin_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance,
              2);
  public static Loader<Object>
      union_of_CWLType_or_stdout_or_stderr_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance =
          new UnionLoader(
              new Loader[] {
                CWLType,
                stdout,
                stderr,
                CommandOutputRecordSchema,
                CommandOutputEnumSchema,
                CommandOutputArraySchema,
                StringInstance,
                array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance
              });
  public static Loader<Object>
      typedsl_union_of_CWLType_or_stdout_or_stderr_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_2 =
          new TypeDslLoader(
              union_of_CWLType_or_stdout_or_stderr_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandOutputRecordSchema_or_CommandOutputEnumSchema_or_CommandOutputArraySchema_or_StringInstance,
              2);
  public static Loader<java.util.List<CommandInputParameter>> array_of_CommandInputParameter =
      new ArrayLoader(CommandInputParameter);
  public static Loader<java.util.List<Object>> idmap_inputs_array_of_CommandInputParameter =
      new IdMapLoader(array_of_CommandInputParameter, "id", "type");
  public static Loader<java.util.List<CommandOutputParameter>> array_of_CommandOutputParameter =
      new ArrayLoader(CommandOutputParameter);
  public static Loader<java.util.List<Object>> idmap_outputs_array_of_CommandOutputParameter =
      new IdMapLoader(array_of_CommandOutputParameter, "id", "type");
  public static Loader<Object> union_of_StringInstance_or_Expression_or_CommandLineBinding =
      new UnionLoader(new Loader[] {StringInstance, Expression, CommandLineBinding});
  public static Loader<java.util.List<Object>>
      array_of_union_of_StringInstance_or_Expression_or_CommandLineBinding =
          new ArrayLoader(union_of_StringInstance_or_Expression_or_CommandLineBinding);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      optional_array_of_union_of_StringInstance_or_Expression_or_CommandLineBinding =
          new OptionalLoader(array_of_union_of_StringInstance_or_Expression_or_CommandLineBinding);
  public static Loader<java.util.List<Integer>> array_of_IntegerInstance =
      new ArrayLoader(IntegerInstance);
  public static Loader<java.util.Optional<java.util.List<Object>>>
      optional_array_of_IntegerInstance = new OptionalLoader(array_of_IntegerInstance);
  public static Loader<java.util.List<SoftwarePackage>> array_of_SoftwarePackage =
      new ArrayLoader(SoftwarePackage);
  public static Loader<java.util.List<Object>> idmap_packages_array_of_SoftwarePackage =
      new IdMapLoader(array_of_SoftwarePackage, "package", "specs");
  public static Loader<java.util.Optional<java.util.List<Object>>>
      uri_optional_array_of_StringInstance_False_False_None =
          new UriLoader(optional_array_of_StringInstance, false, false, null);
  public static Loader<Object>
      union_of_NullInstance_or_File_or_array_of_union_of_File_or_Directory_or_Directory_or_Dirent_or_Expression =
          new UnionLoader(
              new Loader[] {
                NullInstance,
                File,
                array_of_union_of_File_or_Directory,
                Directory,
                Dirent,
                Expression
              });
  public static Loader<java.util.List<Object>>
      array_of_union_of_NullInstance_or_File_or_array_of_union_of_File_or_Directory_or_Directory_or_Dirent_or_Expression =
          new ArrayLoader(
              union_of_NullInstance_or_File_or_array_of_union_of_File_or_Directory_or_Directory_or_Dirent_or_Expression);
  public static Loader<Object>
      union_of_array_of_union_of_NullInstance_or_File_or_array_of_union_of_File_or_Directory_or_Directory_or_Dirent_or_Expression_or_Expression =
          new UnionLoader(
              new Loader[] {
                array_of_union_of_NullInstance_or_File_or_array_of_union_of_File_or_Directory_or_Directory_or_Dirent_or_Expression,
                Expression
              });
  public static Loader<java.util.List<EnvironmentDef>> array_of_EnvironmentDef =
      new ArrayLoader(EnvironmentDef);
  public static Loader<java.util.List<Object>> idmap_envDef_array_of_EnvironmentDef =
      new IdMapLoader(array_of_EnvironmentDef, "envName", "envValue");
  public static Loader<Object> union_of_NullInstance_or_LongInstance_or_Expression =
      new UnionLoader(new Loader[] {NullInstance, LongInstance, Expression});
  public static Loader<Object> union_of_BooleanInstance_or_Expression =
      new UnionLoader(new Loader[] {BooleanInstance, Expression});
  public static Loader<Object> union_of_LongInstance_or_Expression =
      new UnionLoader(new Loader[] {LongInstance, Expression});
  public static Loader<java.util.Optional<InputBinding>> optional_InputBinding =
      new OptionalLoader(InputBinding);
  public static Loader<java.util.List<WorkflowInputParameter>> array_of_WorkflowInputParameter =
      new ArrayLoader(WorkflowInputParameter);
  public static Loader<java.util.List<Object>> idmap_inputs_array_of_WorkflowInputParameter =
      new IdMapLoader(array_of_WorkflowInputParameter, "id", "type");
  public static Loader<java.util.List<ExpressionToolOutputParameter>>
      array_of_ExpressionToolOutputParameter = new ArrayLoader(ExpressionToolOutputParameter);
  public static Loader<java.util.List<Object>>
      idmap_outputs_array_of_ExpressionToolOutputParameter =
          new IdMapLoader(array_of_ExpressionToolOutputParameter, "id", "type");
  public static Loader<Object>
      uri_union_of_NullInstance_or_StringInstance_or_array_of_StringInstance_False_False_0 =
          new UriLoader(
              union_of_NullInstance_or_StringInstance_or_array_of_StringInstance, false, false, 0);
  public static Loader<java.util.Optional<LinkMergeMethod>> optional_LinkMergeMethod =
      new OptionalLoader(LinkMergeMethod);
  public static Loader<java.util.Optional<PickValueMethod>> optional_PickValueMethod =
      new OptionalLoader(PickValueMethod);
  public static Loader<Object>
      uri_union_of_NullInstance_or_StringInstance_or_array_of_StringInstance_False_False_2 =
          new UriLoader(
              union_of_NullInstance_or_StringInstance_or_array_of_StringInstance, false, false, 2);
  public static Loader<java.util.List<WorkflowStepInput>> array_of_WorkflowStepInput =
      new ArrayLoader(WorkflowStepInput);
  public static Loader<java.util.List<Object>> idmap_in_array_of_WorkflowStepInput =
      new IdMapLoader(array_of_WorkflowStepInput, "id", "source");
  public static Loader<Object> union_of_StringInstance_or_WorkflowStepOutput =
      new UnionLoader(new Loader[] {StringInstance, WorkflowStepOutput});
  public static Loader<java.util.List<Object>>
      array_of_union_of_StringInstance_or_WorkflowStepOutput =
          new ArrayLoader(union_of_StringInstance_or_WorkflowStepOutput);
  public static Loader<java.util.List<Object>>
      uri_array_of_union_of_StringInstance_or_WorkflowStepOutput_True_False_None =
          new UriLoader(array_of_union_of_StringInstance_or_WorkflowStepOutput, true, false, null);
  public static Loader<Object>
      union_of_StringInstance_or_CommandLineTool_or_ExpressionTool_or_Workflow_or_Operation =
          new UnionLoader(
              new Loader[] {StringInstance, CommandLineTool, ExpressionTool, Workflow, Operation});
  public static Loader<Object>
      uri_union_of_StringInstance_or_CommandLineTool_or_ExpressionTool_or_Workflow_or_Operation_False_False_None =
          new UriLoader(
              union_of_StringInstance_or_CommandLineTool_or_ExpressionTool_or_Workflow_or_Operation,
              false,
              false,
              null);
  public static Loader<java.util.Optional<ScatterMethod>> optional_ScatterMethod =
      new OptionalLoader(ScatterMethod);
  public static Loader<java.util.Optional<ScatterMethod>>
      uri_optional_ScatterMethod_False_True_None =
          new UriLoader(optional_ScatterMethod, false, true, null);
  public static Loader<java.util.List<WorkflowOutputParameter>> array_of_WorkflowOutputParameter =
      new ArrayLoader(WorkflowOutputParameter);
  public static Loader<java.util.List<Object>> idmap_outputs_array_of_WorkflowOutputParameter =
      new IdMapLoader(array_of_WorkflowOutputParameter, "id", "type");
  public static Loader<java.util.List<WorkflowStep>> array_of_WorkflowStep =
      new ArrayLoader(WorkflowStep);
  public static Loader<java.util.List<Object>> idmap_steps_array_of_WorkflowStep =
      new IdMapLoader(array_of_WorkflowStep, "id", "None");
  public static Loader<java.util.List<OperationInputParameter>> array_of_OperationInputParameter =
      new ArrayLoader(OperationInputParameter);
  public static Loader<java.util.List<Object>> idmap_inputs_array_of_OperationInputParameter =
      new IdMapLoader(array_of_OperationInputParameter, "id", "type");
  public static Loader<java.util.List<OperationOutputParameter>> array_of_OperationOutputParameter =
      new ArrayLoader(OperationOutputParameter);
  public static Loader<java.util.List<Object>> idmap_outputs_array_of_OperationOutputParameter =
      new IdMapLoader(array_of_OperationOutputParameter, "id", "type");
  public static Loader<Object> union_of_CommandLineTool_or_ExpressionTool_or_Workflow_or_Operation =
      new UnionLoader(new Loader[] {CommandLineTool, ExpressionTool, Workflow, Operation});
  public static Loader<java.util.List<Object>>
      array_of_union_of_CommandLineTool_or_ExpressionTool_or_Workflow_or_Operation =
          new ArrayLoader(union_of_CommandLineTool_or_ExpressionTool_or_Workflow_or_Operation);
  public static Loader<Object>
      union_of_CommandLineTool_or_ExpressionTool_or_Workflow_or_Operation_or_array_of_union_of_CommandLineTool_or_ExpressionTool_or_Workflow_or_Operation =
          new UnionLoader(
              new Loader[] {
                CommandLineTool,
                ExpressionTool,
                Workflow,
                Operation,
                array_of_union_of_CommandLineTool_or_ExpressionTool_or_Workflow_or_Operation
              });
}