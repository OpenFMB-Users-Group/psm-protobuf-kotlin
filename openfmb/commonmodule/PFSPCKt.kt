// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializepFSPC")
public inline fun pFSPC(block: openfmb.commonmodule.PFSPCKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.PFSPC =
  openfmb.commonmodule.PFSPCKt.Dsl._create(openfmb.commonmodule.PFSPC.newBuilder()).apply { block() }._build()
/**
 * ```
 * Constant power factor control function
 * ```
 *
 * Protobuf type `commonmodule.PFSPC`
 */
public object PFSPCKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.PFSPC.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.PFSPC.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.PFSPC = _builder.build()

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `bool ctlVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var ctlVal: kotlin.Boolean
      @JvmName("getCtlVal")
      get() = _builder.getCtlVal()
      @JvmName("setCtlVal")
      set(value) {
        _builder.setCtlVal(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `bool ctlVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearCtlVal() {
      _builder.clearCtlVal()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.OperationDFPF pFParameter = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var pFParameter: openfmb.commonmodule.OperationDFPF
      @JvmName("getPFParameter")
      get() = _builder.getPFParameter()
      @JvmName("setPFParameter")
      set(value) {
        _builder.setPFParameter(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.OperationDFPF pFParameter = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearPFParameter() {
      _builder.clearPFParameter()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.OperationDFPF pFParameter = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the pFParameter field is set.
     */
    public fun hasPFParameter(): kotlin.Boolean {
      return _builder.hasPFParameter()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.PFSPC.copy(block: openfmb.commonmodule.PFSPCKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.PFSPC =
  openfmb.commonmodule.PFSPCKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.commonmodule.PFSPCOrBuilder.pFParameterOrNull: openfmb.commonmodule.OperationDFPF?
  get() = if (hasPFParameter()) getPFParameter() else null

