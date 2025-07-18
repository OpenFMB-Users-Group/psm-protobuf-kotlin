// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: regulatormodule/regulatormodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.regulatormodule;

@kotlin.jvm.JvmName("-initializeregulatorDiscreteControlProfile")
public inline fun regulatorDiscreteControlProfile(block: openfmb.regulatormodule.RegulatorDiscreteControlProfileKt.Dsl.() -> kotlin.Unit): openfmb.regulatormodule.RegulatorDiscreteControlProfile =
  openfmb.regulatormodule.RegulatorDiscreteControlProfileKt.Dsl._create(openfmb.regulatormodule.RegulatorDiscreteControlProfile.newBuilder()).apply { block() }._build()
/**
 * ```
 * Regulator control profile.  Instructs an end device (or an end device group) to perform a
 * specified action.
 * ```
 *
 * Protobuf type `regulatormodule.RegulatorDiscreteControlProfile`
 */
public object RegulatorDiscreteControlProfileKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.regulatormodule.RegulatorDiscreteControlProfile.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.regulatormodule.RegulatorDiscreteControlProfile.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.regulatormodule.RegulatorDiscreteControlProfile = _builder.build()

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
     * `.regulatormodule.RegulatorDiscreteControl regulatorDiscreteControl = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var regulatorDiscreteControl: openfmb.regulatormodule.RegulatorDiscreteControl
      @JvmName("getRegulatorDiscreteControl")
      get() = _builder.getRegulatorDiscreteControl()
      @JvmName("setRegulatorDiscreteControl")
      set(value) {
        _builder.setRegulatorDiscreteControl(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.regulatormodule.RegulatorDiscreteControl regulatorDiscreteControl = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearRegulatorDiscreteControl() {
      _builder.clearRegulatorDiscreteControl()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.regulatormodule.RegulatorDiscreteControl regulatorDiscreteControl = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the regulatorDiscreteControl field is set.
     */
    public fun hasRegulatorDiscreteControl(): kotlin.Boolean {
      return _builder.hasRegulatorDiscreteControl()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.regulatormodule.RegulatorSystem regulatorSystem = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var regulatorSystem: openfmb.regulatormodule.RegulatorSystem
      @JvmName("getRegulatorSystem")
      get() = _builder.getRegulatorSystem()
      @JvmName("setRegulatorSystem")
      set(value) {
        _builder.setRegulatorSystem(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.regulatormodule.RegulatorSystem regulatorSystem = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearRegulatorSystem() {
      _builder.clearRegulatorSystem()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.regulatormodule.RegulatorSystem regulatorSystem = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the regulatorSystem field is set.
     */
    public fun hasRegulatorSystem(): kotlin.Boolean {
      return _builder.hasRegulatorSystem()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.regulatormodule.RegulatorDiscreteControlProfile.copy(block: openfmb.regulatormodule.RegulatorDiscreteControlProfileKt.Dsl.() -> kotlin.Unit): openfmb.regulatormodule.RegulatorDiscreteControlProfile =
  openfmb.regulatormodule.RegulatorDiscreteControlProfileKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.regulatormodule.RegulatorDiscreteControlProfileOrBuilder.controlMessageInfoOrNull: openfmb.commonmodule.ControlMessageInfo?
  get() = if (hasControlMessageInfo()) getControlMessageInfo() else null

public val openfmb.regulatormodule.RegulatorDiscreteControlProfileOrBuilder.regulatorDiscreteControlOrNull: openfmb.regulatormodule.RegulatorDiscreteControl?
  get() = if (hasRegulatorDiscreteControl()) getRegulatorDiscreteControl() else null

public val openfmb.regulatormodule.RegulatorDiscreteControlProfileOrBuilder.regulatorSystemOrNull: openfmb.regulatormodule.RegulatorSystem?
  get() = if (hasRegulatorSystem()) getRegulatorSystem() else null

