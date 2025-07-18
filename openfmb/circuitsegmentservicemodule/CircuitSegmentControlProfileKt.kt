// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: circuitsegmentservicemodule/circuitsegmentservicemodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.circuitsegmentservicemodule;

@kotlin.jvm.JvmName("-initializecircuitSegmentControlProfile")
public inline fun circuitSegmentControlProfile(block: openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfileKt.Dsl.() -> kotlin.Unit): openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfile =
  openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfileKt.Dsl._create(openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfile.newBuilder()).apply { block() }._build()
/**
 * ```
 * Switch control profile
 * ```
 *
 * Protobuf type `circuitsegmentservicemodule.CircuitSegmentControlProfile`
 */
public object CircuitSegmentControlProfileKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfile.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfile.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfile = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ControlMessageInfo controlMessageInfo = 1 [(.uml.option_parent_message) = true];`
     */
    public var controlMessageInfo: openfmb.commonmodule.ControlMessageInfo
      @JvmName("getControlMessageInfo")
      get() = _builder.getControlMessageInfo()
      @JvmName("setControlMessageInfo")
      set(value) {
        _builder.setControlMessageInfo(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ControlMessageInfo controlMessageInfo = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearControlMessageInfo() {
      _builder.clearControlMessageInfo()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ControlMessageInfo controlMessageInfo = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the controlMessageInfo field is set.
     */
    public fun hasControlMessageInfo(): kotlin.Boolean {
      return _builder.hasControlMessageInfo()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ApplicationSystem applicationSystem = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var applicationSystem: openfmb.commonmodule.ApplicationSystem
      @JvmName("getApplicationSystem")
      get() = _builder.getApplicationSystem()
      @JvmName("setApplicationSystem")
      set(value) {
        _builder.setApplicationSystem(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ApplicationSystem applicationSystem = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearApplicationSystem() {
      _builder.clearApplicationSystem()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ApplicationSystem applicationSystem = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the applicationSystem field is set.
     */
    public fun hasApplicationSystem(): kotlin.Boolean {
      return _builder.hasApplicationSystem()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.circuitsegmentservicemodule.CircuitSegmentControl circuitSegmentControl = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var circuitSegmentControl: openfmb.circuitsegmentservicemodule.CircuitSegmentControl
      @JvmName("getCircuitSegmentControl")
      get() = _builder.getCircuitSegmentControl()
      @JvmName("setCircuitSegmentControl")
      set(value) {
        _builder.setCircuitSegmentControl(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.circuitsegmentservicemodule.CircuitSegmentControl circuitSegmentControl = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearCircuitSegmentControl() {
      _builder.clearCircuitSegmentControl()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.circuitsegmentservicemodule.CircuitSegmentControl circuitSegmentControl = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the circuitSegmentControl field is set.
     */
    public fun hasCircuitSegmentControl(): kotlin.Boolean {
      return _builder.hasCircuitSegmentControl()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfile.copy(block: openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfileKt.Dsl.() -> kotlin.Unit): openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfile =
  openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfileKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfileOrBuilder.controlMessageInfoOrNull: openfmb.commonmodule.ControlMessageInfo?
  get() = if (hasControlMessageInfo()) getControlMessageInfo() else null

public val openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfileOrBuilder.applicationSystemOrNull: openfmb.commonmodule.ApplicationSystem?
  get() = if (hasApplicationSystem()) getApplicationSystem() else null

public val openfmb.circuitsegmentservicemodule.CircuitSegmentControlProfileOrBuilder.circuitSegmentControlOrNull: openfmb.circuitsegmentservicemodule.CircuitSegmentControl?
  get() = if (hasCircuitSegmentControl()) getCircuitSegmentControl() else null

