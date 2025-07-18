// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: essmodule/essmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.essmodule;

@kotlin.jvm.JvmName("-initializeeSSDiscreteControlProfile")
public inline fun eSSDiscreteControlProfile(block: openfmb.essmodule.ESSDiscreteControlProfileKt.Dsl.() -> kotlin.Unit): openfmb.essmodule.ESSDiscreteControlProfile =
  openfmb.essmodule.ESSDiscreteControlProfileKt.Dsl._create(openfmb.essmodule.ESSDiscreteControlProfile.newBuilder()).apply { block() }._build()
/**
 * ```
 * Cap bank discrete control profile.  Instructs an end device (or an end device group) to perform
 * a specified action.
 * ```
 *
 * Protobuf type `essmodule.ESSDiscreteControlProfile`
 */
public object ESSDiscreteControlProfileKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.essmodule.ESSDiscreteControlProfile.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.essmodule.ESSDiscreteControlProfile.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.essmodule.ESSDiscreteControlProfile = _builder.build()

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
     * `.commonmodule.ESS ess = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var ess: openfmb.commonmodule.ESS
      @JvmName("getEss")
      get() = _builder.getEss()
      @JvmName("setEss")
      set(value) {
        _builder.setEss(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ESS ess = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearEss() {
      _builder.clearEss()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ESS ess = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the ess field is set.
     */
    public fun hasEss(): kotlin.Boolean {
      return _builder.hasEss()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.essmodule.ESSDiscreteControl essDiscreteControl = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var essDiscreteControl: openfmb.essmodule.ESSDiscreteControl
      @JvmName("getEssDiscreteControl")
      get() = _builder.getEssDiscreteControl()
      @JvmName("setEssDiscreteControl")
      set(value) {
        _builder.setEssDiscreteControl(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.essmodule.ESSDiscreteControl essDiscreteControl = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearEssDiscreteControl() {
      _builder.clearEssDiscreteControl()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.essmodule.ESSDiscreteControl essDiscreteControl = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the essDiscreteControl field is set.
     */
    public fun hasEssDiscreteControl(): kotlin.Boolean {
      return _builder.hasEssDiscreteControl()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.essmodule.ESSDiscreteControlProfile.copy(block: openfmb.essmodule.ESSDiscreteControlProfileKt.Dsl.() -> kotlin.Unit): openfmb.essmodule.ESSDiscreteControlProfile =
  openfmb.essmodule.ESSDiscreteControlProfileKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.essmodule.ESSDiscreteControlProfileOrBuilder.controlMessageInfoOrNull: openfmb.commonmodule.ControlMessageInfo?
  get() = if (hasControlMessageInfo()) getControlMessageInfo() else null

public val openfmb.essmodule.ESSDiscreteControlProfileOrBuilder.essOrNull: openfmb.commonmodule.ESS?
  get() = if (hasEss()) getEss() else null

public val openfmb.essmodule.ESSDiscreteControlProfileOrBuilder.essDiscreteControlOrNull: openfmb.essmodule.ESSDiscreteControl?
  get() = if (hasEssDiscreteControl()) getEssDiscreteControl() else null

