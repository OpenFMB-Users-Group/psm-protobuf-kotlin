// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializevSC")
public inline fun vSC(block: openfmb.commonmodule.VSCKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.VSC =
  openfmb.commonmodule.VSCKt.Dsl._create(openfmb.commonmodule.VSC.newBuilder()).apply { block() }._build()
/**
 * ```
 * Visible string status (VSS)
 * ```
 *
 * Protobuf type `commonmodule.VSC`
 */
public object VSCKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.VSC.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.VSC.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.VSC = _builder.build()

    /**
     * ```
     * [OpenFMB Extension]  String control value.
     * ```
     *
     * `string ctlVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var ctlVal: kotlin.String
      @JvmName("getCtlVal")
      get() = _builder.getCtlVal()
      @JvmName("setCtlVal")
      set(value) {
        _builder.setCtlVal(value)
      }
    /**
     * ```
     * [OpenFMB Extension]  String control value.
     * ```
     *
     * `string ctlVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearCtlVal() {
      _builder.clearCtlVal()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.VSC.copy(block: openfmb.commonmodule.VSCKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.VSC =
  openfmb.commonmodule.VSCKt.Dsl._create(this.toBuilder()).apply { block() }._build()

