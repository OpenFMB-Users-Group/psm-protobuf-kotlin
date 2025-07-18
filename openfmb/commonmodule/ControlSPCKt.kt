// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializecontrolSPC")
public inline fun controlSPC(block: openfmb.commonmodule.ControlSPCKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.ControlSPC =
  openfmb.commonmodule.ControlSPCKt.Dsl._create(openfmb.commonmodule.ControlSPC.newBuilder()).apply { block() }._build()
/**
 * ```
 * Controllable single point (SPC)
 * ```
 *
 * Protobuf type `commonmodule.ControlSPC`
 */
public object ControlSPCKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.ControlSPC.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.ControlSPC.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.ControlSPC = _builder.build()

    /**
     * ```
     * Service parameter that determines the control activity ('false' for off or deactivation, 'true'
     * for on or activation).
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
     * Service parameter that determines the control activity ('false' for off or deactivation, 'true'
     * for on or activation).
     * ```
     *
     * `bool ctlVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearCtlVal() {
      _builder.clearCtlVal()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.ControlSPC.copy(block: openfmb.commonmodule.ControlSPCKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.ControlSPC =
  openfmb.commonmodule.ControlSPCKt.Dsl._create(this.toBuilder()).apply { block() }._build()

