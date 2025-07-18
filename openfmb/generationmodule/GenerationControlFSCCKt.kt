// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: generationmodule/generationmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.generationmodule;

@kotlin.jvm.JvmName("-initializegenerationControlFSCC")
public inline fun generationControlFSCC(block: openfmb.generationmodule.GenerationControlFSCCKt.Dsl.() -> kotlin.Unit): openfmb.generationmodule.GenerationControlFSCC =
  openfmb.generationmodule.GenerationControlFSCCKt.Dsl._create(openfmb.generationmodule.GenerationControlFSCC.newBuilder()).apply { block() }._build()
/**
 * ```
 * LN: Schedule controller   Name: FSCC
 * ```
 *
 * Protobuf type `generationmodule.GenerationControlFSCC`
 */
public object GenerationControlFSCCKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.generationmodule.GenerationControlFSCC.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.generationmodule.GenerationControlFSCC.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.generationmodule.GenerationControlFSCC = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ControlFSCC controlFSCC = 1 [(.uml.option_parent_message) = true];`
     */
    public var controlFSCC: openfmb.commonmodule.ControlFSCC
      @JvmName("getControlFSCC")
      get() = _builder.getControlFSCC()
      @JvmName("setControlFSCC")
      set(value) {
        _builder.setControlFSCC(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ControlFSCC controlFSCC = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearControlFSCC() {
      _builder.clearControlFSCC()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ControlFSCC controlFSCC = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the controlFSCC field is set.
     */
    public fun hasControlFSCC(): kotlin.Boolean {
      return _builder.hasControlFSCC()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.generationmodule.GenerationControlScheduleFSCH GenerationControlScheduleFSCH = 2;`
     */
    public var generationControlScheduleFSCH: openfmb.generationmodule.GenerationControlScheduleFSCH
      @JvmName("getGenerationControlScheduleFSCH")
      get() = _builder.getGenerationControlScheduleFSCH()
      @JvmName("setGenerationControlScheduleFSCH")
      set(value) {
        _builder.setGenerationControlScheduleFSCH(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.generationmodule.GenerationControlScheduleFSCH GenerationControlScheduleFSCH = 2;`
     */
    public fun clearGenerationControlScheduleFSCH() {
      _builder.clearGenerationControlScheduleFSCH()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.generationmodule.GenerationControlScheduleFSCH GenerationControlScheduleFSCH = 2;`
     * @return Whether the generationControlScheduleFSCH field is set.
     */
    public fun hasGenerationControlScheduleFSCH(): kotlin.Boolean {
      return _builder.hasGenerationControlScheduleFSCH()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.generationmodule.GenerationControlFSCC.copy(block: openfmb.generationmodule.GenerationControlFSCCKt.Dsl.() -> kotlin.Unit): openfmb.generationmodule.GenerationControlFSCC =
  openfmb.generationmodule.GenerationControlFSCCKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.generationmodule.GenerationControlFSCCOrBuilder.controlFSCCOrNull: openfmb.commonmodule.ControlFSCC?
  get() = if (hasControlFSCC()) getControlFSCC() else null

public val openfmb.generationmodule.GenerationControlFSCCOrBuilder.generationControlScheduleFSCHOrNull: openfmb.generationmodule.GenerationControlScheduleFSCH?
  get() = if (hasGenerationControlScheduleFSCH()) getGenerationControlScheduleFSCH() else null

