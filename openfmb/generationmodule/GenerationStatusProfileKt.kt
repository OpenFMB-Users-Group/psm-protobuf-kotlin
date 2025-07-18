// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: generationmodule/generationmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.generationmodule;

@kotlin.jvm.JvmName("-initializegenerationStatusProfile")
public inline fun generationStatusProfile(block: openfmb.generationmodule.GenerationStatusProfileKt.Dsl.() -> kotlin.Unit): openfmb.generationmodule.GenerationStatusProfile =
  openfmb.generationmodule.GenerationStatusProfileKt.Dsl._create(openfmb.generationmodule.GenerationStatusProfile.newBuilder()).apply { block() }._build()
/**
 * ```
 * Generation status profile
 * ```
 *
 * Protobuf type `generationmodule.GenerationStatusProfile`
 */
public object GenerationStatusProfileKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.generationmodule.GenerationStatusProfile.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.generationmodule.GenerationStatusProfile.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.generationmodule.GenerationStatusProfile = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.StatusMessageInfo statusMessageInfo = 1 [(.uml.option_parent_message) = true];`
     */
    public var statusMessageInfo: openfmb.commonmodule.StatusMessageInfo
      @JvmName("getStatusMessageInfo")
      get() = _builder.getStatusMessageInfo()
      @JvmName("setStatusMessageInfo")
      set(value) {
        _builder.setStatusMessageInfo(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.StatusMessageInfo statusMessageInfo = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearStatusMessageInfo() {
      _builder.clearStatusMessageInfo()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.StatusMessageInfo statusMessageInfo = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the statusMessageInfo field is set.
     */
    public fun hasStatusMessageInfo(): kotlin.Boolean {
      return _builder.hasStatusMessageInfo()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.generationmodule.GeneratingUnit generatingUnit = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var generatingUnit: openfmb.generationmodule.GeneratingUnit
      @JvmName("getGeneratingUnit")
      get() = _builder.getGeneratingUnit()
      @JvmName("setGeneratingUnit")
      set(value) {
        _builder.setGeneratingUnit(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.generationmodule.GeneratingUnit generatingUnit = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearGeneratingUnit() {
      _builder.clearGeneratingUnit()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.generationmodule.GeneratingUnit generatingUnit = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the generatingUnit field is set.
     */
    public fun hasGeneratingUnit(): kotlin.Boolean {
      return _builder.hasGeneratingUnit()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.generationmodule.GenerationStatus generationStatus = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var generationStatus: openfmb.generationmodule.GenerationStatus
      @JvmName("getGenerationStatus")
      get() = _builder.getGenerationStatus()
      @JvmName("setGenerationStatus")
      set(value) {
        _builder.setGenerationStatus(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.generationmodule.GenerationStatus generationStatus = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearGenerationStatus() {
      _builder.clearGenerationStatus()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.generationmodule.GenerationStatus generationStatus = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the generationStatus field is set.
     */
    public fun hasGenerationStatus(): kotlin.Boolean {
      return _builder.hasGenerationStatus()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.generationmodule.GenerationStatusProfile.copy(block: openfmb.generationmodule.GenerationStatusProfileKt.Dsl.() -> kotlin.Unit): openfmb.generationmodule.GenerationStatusProfile =
  openfmb.generationmodule.GenerationStatusProfileKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.generationmodule.GenerationStatusProfileOrBuilder.statusMessageInfoOrNull: openfmb.commonmodule.StatusMessageInfo?
  get() = if (hasStatusMessageInfo()) getStatusMessageInfo() else null

public val openfmb.generationmodule.GenerationStatusProfileOrBuilder.generatingUnitOrNull: openfmb.generationmodule.GeneratingUnit?
  get() = if (hasGeneratingUnit()) getGeneratingUnit() else null

public val openfmb.generationmodule.GenerationStatusProfileOrBuilder.generationStatusOrNull: openfmb.generationmodule.GenerationStatus?
  get() = if (hasGenerationStatus()) getGenerationStatus() else null

